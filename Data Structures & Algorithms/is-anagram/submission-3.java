class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> helper=new HashMap<>();
         Map<Character,Integer> helper1=new HashMap<>();
        char[] char1=s.toCharArray();
        char[] char2=t.toCharArray();
        for(Character c:char1){
            helper.put(c,helper.getOrDefault(c,0)+1);
        }

         for(Character c:char2){
           helper.put(c,helper1.getOrDefault(c,0)+1);
        }

        for(Character c:char1){
            if(helper.get(c)!=helper1.get(c)){
                return false;
            }
        
        }

        return true;

       

    }
}
