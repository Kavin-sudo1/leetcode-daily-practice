// Last updated: 1/24/2026, 8:20:06 AM
class Solution {
    public int differenceOfSums(int n, int m) {
        int  sumn=0;
        for(int i=0;i<=n;i++){
            if(i%m!=0) sumn+=i;

        }
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%m==0) sum+=i;

        }
        return sumn-sum;
        
    }
}