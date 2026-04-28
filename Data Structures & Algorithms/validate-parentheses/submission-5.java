class Solution {
    public boolean isValid(String s) {
        char[] charArray=s.toCharArray();
        Deque<Character> helper=new ArrayDeque<>();
        for (char c : charArray) {
    if (c == '(' || c == '[' || c == '{') {
        // 情况 1：左括号，只负责压栈
        helper.push(c);
    } else {
        // 情况 2：右括号，负责检查和弹出
        if (helper.isEmpty()) return false; // 栈空了，说明右括号多余
        
        char top = helper.pop();
        if (c == ')' && top != '(') return false;
        if (c == ']' && top != '[') return false;
        if (c == '}' && top != '{') return false;
    }
}

        return helper.isEmpty()?true:false;

    }
}
