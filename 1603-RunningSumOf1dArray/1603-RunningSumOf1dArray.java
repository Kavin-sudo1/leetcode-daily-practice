// Last updated: 1/24/2026, 8:20:40 AM
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        //for(int i=0;i<nums.length;i++){
          //  System.out.print(nums[i]);
        //}
         return nums;
        
    }
   
}