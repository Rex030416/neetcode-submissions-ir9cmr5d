class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        char[] ch=s.toCharArray();
        while(i<j){
            if(Character.isLetterOrDigit(ch[i])&&Character.isLetterOrDigit(ch[j])){
            if(Character.toLowerCase(ch[i]) != Character.toLowerCase(ch[j])){
                    return false;
                }else{
                    i++;
                    j--;
                }
            
            }


            if(!Character.isLetterOrDigit(ch[i])) {
                i++;
            }

             if(!Character.isLetterOrDigit(ch[j])) {
                j--;
            }
        }

        return true;

    }
}
