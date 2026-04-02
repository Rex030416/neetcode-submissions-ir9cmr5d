class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int len=prices.length;
        if(len==1){
            return 0;
        }

        int i=0;
        int j=0;
        while(j<prices.length){
            if(prices[j]-prices[i]>0){
                int tmpMax=prices[j]-prices[i];
                maxProfit=Math.max(tmpMax,maxProfit);
            }else{
                i=j;
            }
            j++;
        }

        return maxProfit;


    }
}
