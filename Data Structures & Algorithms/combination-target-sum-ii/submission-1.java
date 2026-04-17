class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> singleRes=new ArrayList<>();
        Set<List<Integer>> helper=new HashSet<>();
        DFS(res,singleRes,candidates,target,0,helper);
        return res;
    }

    private void DFS(List<List<Integer>> res, List<Integer> singleRes,int[] candidates,int target,int curIndex,Set<List<Integer>> helper){
        if(target==0){
            if(helper.contains(singleRes)){
                return; 
            }
            helper.add(singleRes);
            res.add(new ArrayList<>(singleRes));
            return;
        }

        if (curIndex == candidates.length || target < 0) {
            return;
        }

        //not add
        DFS(res,singleRes,candidates,target,curIndex+1,helper);

        //add
        singleRes.add(candidates[curIndex]);
        DFS(res,singleRes,candidates,target-candidates[curIndex],curIndex+1,helper);
        singleRes.remove(singleRes.size()-1);




    }
}
