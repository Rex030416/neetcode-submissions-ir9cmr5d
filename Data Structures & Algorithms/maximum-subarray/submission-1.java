class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp=new int[nums.length];
        if(nums.length==1){
            return nums[0];
        }
        int curMax=nums[0];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            int prev=dp[i-1];
            if(prev<0){
                dp[i]=nums[i];
            }else{
                dp[i]=nums[i]+dp[i-1];
                
            }
            if(dp[i]>curMax){
                    curMax=dp[i];
                }
        }
        return curMax;

    }
}
