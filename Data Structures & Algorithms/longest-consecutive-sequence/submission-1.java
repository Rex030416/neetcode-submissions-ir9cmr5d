class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> helper=new HashSet<>();
        int globalMax=0;
        for(int i=0;i<nums.length;i++){
            helper.add(nums[i]);
        }

        for(Integer i:helper){
            if(!helper.contains(i-1)){
                int curNum=i;
                int curLen=1;

                while (helper.contains(curNum + 1)) {
                    curNum += 1;
                    curLen += 1;
            }

                 globalMax = Math.max(globalMax, curLen);
            }
        }

        return globalMax;
    }
}
