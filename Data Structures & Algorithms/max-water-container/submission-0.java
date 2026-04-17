class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int globalMax=0;
        while(i<j){
            int width=j-i;
            int height=heights[i]<heights[j]?heights[i]:heights[j];
            int vol=width*height;
            if(vol>globalMax){
                globalMax=vol;
            }
            if(heights[i]<=heights[j]){
                j--;
            }else{
                i++;
            }
        }

        return globalMax;
    }
}
