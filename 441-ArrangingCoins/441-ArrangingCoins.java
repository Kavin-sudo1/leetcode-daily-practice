// Last updated: 1/24/2026, 8:21:00 AM
class Solution {
    public int arrangeCoins(int n) {
      int row=0;
      int temp=n;
      for(int i=1;temp>=i;i++){
        row+=1;
        temp-=i;
      }

    
    return row;
        
    }
}