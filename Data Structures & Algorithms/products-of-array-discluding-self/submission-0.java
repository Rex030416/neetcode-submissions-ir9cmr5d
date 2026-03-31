class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        int[] pre=new int[nums.length];
        int[] post=new int[nums.length];

        pre[0]=nums[0];
        post[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]*nums[i];
           
        }
        for(int i=nums.length-2;i>=0;i--){
            post[i]=post[i+1]*nums[i];
        }

        for(int i=0;i<nums.length;i++){
            if(i==0){
                res[i]=post[i+1];
            }
            else if(i==nums.length-1){
                res[i]=pre[i-1];
            }else{
                res[i]=pre[i-1]*post[i+1];
            }
        }
        return res;


    }
}  
