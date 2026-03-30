class Solution {
    public int evalRPN(String[] tokens) {
        int res=0;
        Deque<Integer> helper=new ArrayDeque<>();
        for(int i=0;i<tokens.length;i++){
            String currentToken=tokens[i];
            if(currentToken.equals("+")||currentToken.equals("-")||currentToken.equals("/")||currentToken.equals("*")){
                int secondNumber=helper.pop();
                int firstNumber=helper.pop();
                if(tokens[i].equals("+")){
                    res=secondNumber+firstNumber;
                    helper.push(res);
                }
                if(tokens[i].equals("-")){
                    res=firstNumber-secondNumber;
                    helper.push(res);
                }
                if(tokens[i].equals("/")){
                    res=firstNumber/secondNumber;
                    helper.push(res);
                }
                if(tokens[i].equals("*")){
                    res=firstNumber*secondNumber;
                    helper.push(res);
                }

            }else{
                helper.push(Integer.parseInt(currentToken));
            }
        }

        return helper.peek();
    }
}