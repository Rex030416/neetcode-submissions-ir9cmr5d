class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Deque<Double> helper=new ArrayDeque<>();
        int[][] pair=new int[position.length][2];
        for(int i=0;i<position.length;i++){
            pair[i][0]=position[i];
            pair[i][1]=speed[i];
        }
        Arrays.sort(pair,(a,b)->Integer.compare(b[0],a[0]));
        helper.push((double)(target-pair[0][0])/pair[0][1]);
        for(int i=1;i<position.length;i++){
            double timeConsume=(double)(target-pair[i][0])/pair[i][1];
            if(timeConsume<=helper.peek()){
                continue;
            }else{
                helper.push(timeConsume);
            }

        }
        return helper.size();
        
    }
}
