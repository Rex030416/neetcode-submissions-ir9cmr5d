class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> helper=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(helper.contains(nums[i])){
                return nums[i];
            }else{
                helper.add(nums[i]);
            }
        }


        return 0;
    }
}
