// Last updated: 1/24/2026, 8:20:20 AM
class Solution {
    public int pivotInteger(int n) 
     {
       int totlen=( n*(n+1))/2;
        int a=(int)Math.sqrt(totlen);
        if((a*a)==totlen) return a;
        return -1;
       
        
    }
}
        
    