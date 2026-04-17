class Solution {
    public boolean isValid(String s) {
        char[] charArray=s.toCharArray();
        Deque<Character> helper=new ArrayDeque<>();
        for(Character c:charArray){
            if(c=='('||c=='['||c=='{'){
                helper.push(c);
            }
            if(c==')'&&helper.peek()=='('){
                helper.pop();
            }else{
                helper.push(c);
            }
            if(c=='}'&&helper.peek()=='{'){
                helper.pop();
            }else{
                helper.push(c);
            }
            if(c==']'&&helper.peek()=='['){
                helper.pop();
            }else{
                helper.push(c);
            }
        }

        return helper.isEmpty()?true:false;

    }
}
