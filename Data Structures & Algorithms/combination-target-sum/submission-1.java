class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> singleRes=new ArrayList<>();
        recur(res,singleRes,0,nums,target);
        return res;
    }

    private void recur(List<List<Integer>> res, List<Integer> singleRes,int curIndex,int[] nums, int target){
        if(target==0){
            res.add(new ArrayList<>(singleRes));
            return;
        }

        
        int curNum=nums[curIndex];
        int loopNum=target/curNum;
        for(int i=0;i<=loopNum;i++){
            for(int j=0;j<i;j++){
               singleRes.add(curNum);
            }
            recur(res,singleRes,curIndex+1,nums,target-i*curNum);

            for (int j = 0; j < i; j++) {
                singleRes.remove(singleRes.size() - 1);
            }

        }
    }
}
