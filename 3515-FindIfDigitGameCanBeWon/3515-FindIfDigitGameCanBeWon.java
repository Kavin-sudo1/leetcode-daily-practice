// Last updated: 1/24/2026, 8:20:00 AM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int single = 0;  
        int dbl = 0;     
        
        for (int num : nums) {
            if (num < 10) single += num;
            else dbl += num;
        }
        
        
        if (single > dbl) return true;

        
        if (dbl > single) return true;

        return false;
    }
}
