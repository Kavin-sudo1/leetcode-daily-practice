// Last updated: 1/24/2026, 8:20:58 AM
class Solution {
    public int hammingDistance(int x, int y) {
        int z=x^y;
        int count=0;
        while(z!=0){
            z=z&(z-1); 
            count++;
        }
        return count;

        
    }
}