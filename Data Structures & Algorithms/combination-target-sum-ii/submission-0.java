class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> singleRes=new ArrayList<>();
        DFS(res,singleRes,candidates,target,0);
        return res;
    }

    private void DFS(List<List<Integer>> res, List<Integer> singleRes,int[] candidates,int target,int curIndex){
        if(target==0){
            res.add(new ArrayList<>(singleRes));
            return;
        }

        if (curIndex == candidates.length || target < 0) {
            return;
        }

        //not add
        DFS(res,singleRes,candidates,target,curIndex+1);

        //add
        singleRes.add(candidates[curIndex]);
        DFS(res,singleRes,candidates,target-candidates[curIndex],curIndex+1);
        singleRes.remove(singleRes.size()-1);




    }
}
