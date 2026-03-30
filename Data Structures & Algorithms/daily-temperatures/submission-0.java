class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res=new int[temperatures.length];
        Deque<int[]> stack=new ArrayDeque<>();
         for (int i = 0; i < temperatures.length; i++){
            int t=temperatures[i];
            while(!stack.isEmpty()&&t>stack.peek()[1]){
                int[] tmp=stack.pop();
                int index=tmp[0];
                res[index]=i-index;
            }

            stack.push(new int[]{i,temperatures[i]});
         
         }

         return res;
    }

}
