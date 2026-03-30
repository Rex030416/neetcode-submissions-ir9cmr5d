class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> singleRes=new ArrayList<>();
        recur(res,nums,0,singleRes);
        return res;
    }

    private void recur(List<List<Integer>> res, int[] nums, int index,List<Integer> singleRes){
        if(index==nums.length){
            res.add(new ArrayList<>(singleRes));
            return;
        }
        //x add
        recur(res,nums,index+1,singleRes);

        //add
        singleRes.add(nums[index]);
        recur(res,nums,index+1,singleRes);

        //backtracing
        singleRes.remove(singleRes.size()-1);


    } 
}
