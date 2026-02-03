// Last updated: 2/3/2026, 8:11:50 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int csum=0;
        for(int i=0;i<nums.length;i++){
            csum+=nums[i];
            if(csum>max) max=csum;
            if(csum<0) csum=0;
        }
        return max;
        
    }
}