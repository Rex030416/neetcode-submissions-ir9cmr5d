class Solution {
    public boolean isPalindrome(String s) {
        char[] charArray=s.toCharArray();
        int i=0,j=charArray.length-1;
        boolean res=true;
        while(i<j){
            if(charArray[i]!=charArray[j]){
                res=false;
                break;
            }
            i++;
            j--;
        }
        return res;
    }
}
