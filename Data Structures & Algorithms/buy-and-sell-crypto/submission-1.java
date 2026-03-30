class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int i=0;
        int j=1;
        while(j<prices.length){
            if(prices[j]>prices[i]){
                int tmp=prices[j]-prices[i];
                maxProfit=Math.max(tmp,maxProfit);
            }else{
                i=j;
            }
            j++;
        }
        return maxProfit;

    }
}
