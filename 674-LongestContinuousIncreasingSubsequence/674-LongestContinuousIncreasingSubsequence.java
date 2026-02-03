// Last updated: 2/3/2026, 8:11:19 PM
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        // int count = 0;
        // int init = 1;
        // boolean n = true;

        // // check if array is non-decreasing
        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] < nums[i - 1]) {
        //         n = false;}
        //         else if(nums[i] == nums[i - 1]) return init;
                
            
        // }

        // // ✅ corrected line
        // if (n == true) return nums.length;

        // else {
        //     for (int i = 1; i < nums.length; i++) {
        //         if (nums[i] > nums[i - 1]) count++;
        //     }
        // }
        // return (count > 0) ? count : init;class Solution {
 
      
        if (nums.length == 0) return 0;

        int maxLen = 1;       // longest subsequence found
        int currentLen = 1;   // current subsequence length

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentLen++; // extend the subsequence
                maxLen = Math.max(maxLen, currentLen);
            } else {
                currentLen = 1; // reset when sequence breaks
            }
        }

        return maxLen;
    }
}
        