class Solution {
    public int jump(int[] nums) {
        int len=nums.length;
        int[] dp=new int[len];
        Arrays.fill(dp,1000000);
        dp[len-1]=0;

        for(int i=len-2;i>=0;i--){
            int end=Math.min(nums.length,i+nums[i]+1);
            for(int j=i+1;j<end;j++){
                dp[i]=Math.min(dp[i],1+dp[j]);
            }
        }

        return dp[0];

    }
}
