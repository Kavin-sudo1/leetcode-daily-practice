// Last updated: 1/24/2026, 8:21:21 AM
class Solution {
    public int singleNumber(int[] nums) {
        int sing=0;
        for(int n:nums){
            sing^=n;

        }
        return sing;
        
    }
}