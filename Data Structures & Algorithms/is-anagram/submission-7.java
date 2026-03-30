class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> helper=new HashMap<>();
         Map<Character,Integer> helper1=new HashMap<>();
        char[] char1=s.toCharArray();
        char[] char2=t.toCharArray();
        for(Character c:char1){
            helper.put(c,helper.getOrDefault(c,0)+1);
        }

         for(Character c:char2){
           helper1.put(c,helper1.getOrDefault(c,0)+1);
        }

        for(Character c:char1){
           if (!helper.get(c).equals(helper1.get(c))) {
    return false;
}
        
        }

        return true;

       

    }
}
