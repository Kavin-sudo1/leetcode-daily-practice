// Last updated: 1/24/2026, 8:20:14 AM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle=time/(n-1);
        int rem=time%(n-1);

        if(cycle%2==0) return rem+1;
        else return n-rem;
        
    }
}