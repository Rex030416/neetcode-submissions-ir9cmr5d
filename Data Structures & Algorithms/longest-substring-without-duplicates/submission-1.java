class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] array=s.toCharArray();
        Set<Character> helper=new HashSet<>();
        if(array.length<=1){
            return array.length;
        }
        int i=0;
        int j=0;
        int globalMax=1;
        while(j<array.length){
            if(helper.contains(array[j])){
                i=j;
                j=i;
                helper.clear();
            }else{
                helper.add(array[j]);
                j++;
                int curLen=j-i;
                if(curLen>globalMax){
                    globalMax=curLen;
                }
            }
        }

        return globalMax;

    }
}
