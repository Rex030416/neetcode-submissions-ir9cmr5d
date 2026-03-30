class Solution {
    public int trap(int[] height) {
        int curSum=0;
        int length=height.length;
        int[] maxLeft=new int[length];
        int[] maxRight=new int[length];
        int[] min=new int[length];
        int curLeftMax=0;
        int curRightMax=0;

        //search for maxLeft
        for(int i=0;i<length;i++){
            if(height[i]<=curLeftMax){
                maxLeft[i]=curLeftMax;
            }else{
                maxLeft[i]=curLeftMax;
                curLeftMax=height[i];
            }
        }


        for(int i=length-1;i>=0;i--){
            if(height[i]<=curRightMax){
                maxRight[i]=curRightMax;
            }else{
                maxRight[i]=curRightMax;
                curRightMax=height[i];
            }
        }

        for(int i=0;i<length;i++){
            min[i]=Math.min(maxLeft[i],maxRight[i]);
            int water = min[i] - height[i];
            if (water > 0) {
            curSum += water;
            }
        }

        return curSum;


      

    }
}
