class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> helper = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (helper.containsKey(complement)) {
                return new int[] { helper.get(complement), i };
            }
            
            // 2. 如果没有，就把当前的数字和下标存起来
            helper.put(nums[i], i);
        }
        
        // 按照题目要求，通常假设一定有解，否则返回空数组
        return new int[0];
    }
}