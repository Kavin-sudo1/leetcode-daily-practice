// Last updated: 1/24/2026, 8:20:01 AM
class Solution {
    public String winningPlayer(int x, int y) {
        int count=1;
        while(x>=1&&y>=4){
            
                x-=1;
                y-=4;
                count++;

            }
            if(count%2==0) return "Alice";
            else  return "Bob";
        }
        
        
    }
