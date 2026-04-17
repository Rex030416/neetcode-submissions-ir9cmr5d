class MinStack {
    Deque<Integer> min;
    Deque<Integer> helper;

    public MinStack() {
        min=new ArrayDeque<>();
        helper=new ArrayDeque<>();
    }
    
    public void push(int val) {
        min.push(val);
        if(helper.isEmpty()||val<=helper.peek()){
            helper.push(val);
        }
        
    }
    
    public void pop() {
        if(min.peek()==helper.peek()){
            min.pop();
            helper.pop();
        }else{
            min.pop();
        }

    }
    
    public int top() {
        return min.peek();
    }
    
    public int getMin() {
        return helper.peek();
        
    }
}
