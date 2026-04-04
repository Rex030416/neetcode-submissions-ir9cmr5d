class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> helper=new HashSet<>();
        int l=0;
        int res=0;

    
        for(int r=0;r<s.length();r++){
            while(helper.contains(s.charAt(r))){
                helper.remove(s.charAt(l));
                l++;
            }
            helper.add(s.charAt(r));
            res = Math.max(res, r - l + 1);

        }
        return res;
    }
}
