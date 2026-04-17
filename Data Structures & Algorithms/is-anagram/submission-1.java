class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> helper=new HashMap<>();
         Map<Character,Integer> helper1=new HashMap<>();
        char[] char1=s.toCharArray();
        char[] char2=t.toCharArray();
        for(Character c:char1){
            helper.put(getOrDefault(c,0)+1);
        }

         for(Character c:char2){
           helper1.put(getOrDefault(c,0)+1);
        }

        for(Character c:char1){
            if(helper.getValue(i)!=helper1.getValue(i)){
                return false;
            }
        
        }

        return true;




        for(Character c:char2){
            if(!helper.contains(c)){
                return false;
            }
        }

        return true;


    }
}
