// Last updated: 1/24/2026, 8:20:03 AM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int or=x;
        int sum=0;
        while(x>0){
            //
            //int digit=x%10;
            sum+=x%10;
            x/=10;
        }
        if(or%sum==0) return sum;
        return -1;
        
    }
}