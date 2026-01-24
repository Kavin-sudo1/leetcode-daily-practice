// Last updated: 1/24/2026, 8:19:47 AM
class Solution {
    public int mirrorDistance(int n) {
       // return Math.abs(n-reverse(n));
        int ori=n;
        int s=0;
        while(n>0){
            int digit=n%10;
            s=s*10+digit;
            n/=10;
            
        }
        return Math.abs(ori-s);
    }
}