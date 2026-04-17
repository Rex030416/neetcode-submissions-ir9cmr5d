class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] array1=s1.toCharArray();
        char[] array2=s2.toCharArray();
        if(array1.length>array2.length){
            return false;
        }
        Map<Character, Integer> count1 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            count1.put(c, count1.getOrDefault(c, 0) + 1);
        }
        int need=count1.size();
        for(int i=0;i<array2.length-array1.length;i++){
            Map<Character, Integer> count2 = new HashMap<>();
            int match=0;
            for(int j=0;j<array1.length;j++){
               char cur=array2[i+j];
               if(count2.containsKey(cur)&&count2.get(cur)>0){
                    count2.put(cur, count2.get(cur) - 1);
                    match++;
               }else{
                break;
               }
            }

            if(match==array1.length){
                return true;
            }

        }

        return false;

    }
}
