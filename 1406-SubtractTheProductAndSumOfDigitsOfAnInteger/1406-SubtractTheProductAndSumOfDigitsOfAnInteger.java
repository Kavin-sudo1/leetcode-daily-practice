// Last updated: 1/24/2026, 8:20:43 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;
        while(n>0)
        {
            int digit=n%10;
            sum=sum+digit;
            pro=pro*digit;
            n/=10;
        }
        
        return pro-sum;
        
    }
}