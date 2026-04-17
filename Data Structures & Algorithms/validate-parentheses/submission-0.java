class Solution {
    public boolean isValid(String s) {
        char[] charArray=s.toCharArray();
        Deque<Character> helper=new ArrayDeque<>();
        for(Character c:helper){
            if(c=='('||c=='['||c=='{'){
                helper.push(c);
            }
            if(c==')'&&helper.peek()=='('){
                helper.pop();
            }
            if(c=='}'&&helper.peek()=='{'){
                helper.pop();
            }
            if(c==']'&&helper.peek()=='['){
                helper.pop();
            }
        }

        return helper.isEmpty()?true:false;

    }
}
