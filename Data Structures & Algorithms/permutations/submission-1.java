class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> singleRes=new ArrayList<>();
        backtrace(res,singleRes,0,nums);
        return res;
    }

    private void backtrace( List<List<Integer>> res,List<Integer> singleRes,int curIndex,int[] nums){
        if(curIndex==nums.length){
            res.add(new ArrayList<>(singleRes));
            return;
        }
        for(int i=curIndex;i<nums.length;i++){
            swap(curIndex,i,nums);
            singleRes.add(nums[curIndex]);
            backtrace(res,singleRes,curIndex+1,nums);
            singleRes.remove(singleRes.size() - 1);
            swap(curIndex,i,nums);
        }

    }

    private void swap(int i,int j, int[] nums){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
        return;
    }
}
