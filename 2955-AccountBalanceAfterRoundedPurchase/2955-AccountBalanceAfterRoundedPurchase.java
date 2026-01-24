// Last updated: 1/24/2026, 8:20:07 AM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount%10==0) return 100-purchaseAmount;
        int rounded = (int)((( purchaseAmount+ 5) / 10) * 10);

        
        
    return 100-rounded;}
}