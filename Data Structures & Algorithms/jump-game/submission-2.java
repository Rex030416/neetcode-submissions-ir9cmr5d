class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int len=nums.length;

        boolean res=false;
        int[] dp=new int[len];
        dp[len-1]=1;
        
        for(int i=len-2;i>=0;i--){
            for(int j=1;j<=nums[i];j++){
                if(i+j<len&&dp[i+j]==1){
                    dp[i]=1;
                    continue;
                }
            }
        }

        if(dp[0]==1){
            return true;
        }else{
            return false;
        }
    }
}
