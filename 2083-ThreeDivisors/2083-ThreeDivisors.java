// Last updated: 1/24/2026, 8:20:28 AM
class Solution {
    public boolean isThree(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        if(count==3) return true;
        return false;
        
    }
}