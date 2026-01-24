// Last updated: 1/24/2026, 8:20:54 AM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int x=n^(n>>1);
        if((x&(x+1))==0) return true;
        return false;
        
    }
}