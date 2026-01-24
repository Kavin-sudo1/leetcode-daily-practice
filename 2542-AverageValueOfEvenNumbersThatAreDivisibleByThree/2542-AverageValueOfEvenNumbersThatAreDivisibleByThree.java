// Last updated: 1/24/2026, 8:20:22 AM
class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int count=0;
        for (int n:nums){
            if(n%2==0 && n%3==0) {
                sum+=n;
                count++;
                }
           // if(n%2!=0) return 0;
        }
        if (sum==0) return 0;
         return sum/count;
        
    }
}