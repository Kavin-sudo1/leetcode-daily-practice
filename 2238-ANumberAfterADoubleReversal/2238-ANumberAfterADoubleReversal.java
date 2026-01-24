// Last updated: 1/24/2026, 8:20:26 AM
class Solution {
    public boolean isSameAfterReversals(int num) {
     
    
    if (num == 0) {
            return true;
        }
        
        if (num % 10 == 0) {
            return false;
        }
        return true;
    }

    }
     
