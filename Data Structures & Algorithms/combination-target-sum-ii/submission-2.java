class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> singleRes=new ArrayList<>();
        Arrays.sort(candidates);
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

        for(int i=curIndex;i<candidates.length;i++){
            if(i>curIndex&&candidates[i]==candidates[i-1]){
                continue;
            }
            singleRes.add(candidates[i]);
            DFS(res, singleRes, candidates, target - candidates[i], i + 1);
            singleRes.remove(singleRes.size() - 1);
        }

       




    }
}
