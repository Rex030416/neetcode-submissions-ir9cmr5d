class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> helper=new HashMap<>();
        int[] res= new int[2];
        for(int i=0;i<nums.length;i++){
            helper.put(nums[i],i);
            if(helper.containsKey(target-nums[i])){
                int secIndex=helper.get(target-nums[i]);
                if(secIndex<i){
                    res[0]=secIndex;
                    res[1]=i;
                }else{
                    res[0]=i;
                    res[1]=secIndex;
                }
            }
        }
        return res;
    }
}
