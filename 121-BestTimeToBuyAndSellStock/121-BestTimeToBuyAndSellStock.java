// Last updated: 1/24/2026, 8:21:24 AM
class Solution {
    public int maxProfit(int[] prices) {
        int bp=prices[0];
        int maxp=0;
        for(int i=1;i<prices.length;i++){
            int sp=prices[i];
            if(sp>bp){
                int profit=sp-bp;
                maxp=Math.max(maxp,profit);
            }
            else{
                bp=sp;
            }
        }
        return maxp;


       /* int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }

            profit = Math.max(profit, prices[i] - buyPrice);
        }

        return profit;   */     
    }
}