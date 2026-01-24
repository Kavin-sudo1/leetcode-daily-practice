// Last updated: 1/24/2026, 8:20:46 AM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
        
        for(int p : position){
            if(p%2==0) even++;
            else odd++;
        }
        
      
       return (even<odd)? even:odd;                
    }
}