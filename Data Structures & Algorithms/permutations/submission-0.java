class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        if(nums.length==0){
            return res;
        }
        List<Integer> singleRes=new ArrayList<>();
        recur(nums,res,singleRes,0);
        return res;
    }


    private void recur(int[] nums,List<List<Integer>> res,List<Integer> singleRes, int index){
        if(index==nums.length){
            res.add(new ArrayList<>(singleRes));
            return;
        }

        for(int i=0;i<nums.length-index;i++){
            swap(nums,index,index+i);
            singleRes.add(nums[index]);
            recur(nums,res,singleRes,index+1);
            singleRes.remove(singleRes.size()-1);
            swap(nums,index,index+i);
        }
    }

    private void swap(int[] nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
        return;
    }
}
