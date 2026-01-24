// Last updated: 1/24/2026, 8:21:18 AM
class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>0){
            n/=5;
            count+=n;



        }/*
        if(n==0) return 0;
        int mul=1;
        for(int i=1;i<=n;i++){
            mul*=i;
        }
        int nm=mul;
        int count=0;
        while(nm>0){
        if(nm%10==0){
            count++;
        }else break;
        nm/=10;
        }*/
        return count;
    }
}