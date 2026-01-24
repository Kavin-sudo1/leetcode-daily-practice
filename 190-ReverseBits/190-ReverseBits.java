// Last updated: 1/24/2026, 8:21:16 AM
class Solution {
    public int reverseBits(int n) {
        
        int a=0;
        for(int i=0;i<32;i++){ // for every 32 bits
            a<<=1;  // making first bit as empty by placing 0
            a=(a|(n&1));// n&1  we get last bit and or with a to replace it
            n>>=1;// emove the bit that that reversed
        }
        return a;
        
    }
}