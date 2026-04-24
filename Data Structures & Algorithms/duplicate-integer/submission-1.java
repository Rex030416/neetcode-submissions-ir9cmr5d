class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int a:nums){
            if(set.contains(a)){
                return true;
            }
            set.add(a);
        }
        return false;
    }
}
/*
时间复杂度：O(n)
空间复杂度：O(n)
*/