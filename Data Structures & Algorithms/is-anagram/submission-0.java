class Solution {
    public boolean isAnagram(String s, String t) {
        Set<Character> helper=new HashSet<>();
        char[] char1=s.toCharArray();
        char[] char2=t.toCharArray();
        for(Character c:char1){
            helper.add(c);
        }

        for(Character c:char2){
            if(!helper.contains(c)){
                return false;
            }
        }

        return true;


    }
}
