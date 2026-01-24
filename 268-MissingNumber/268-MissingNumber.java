// Last updated: 1/24/2026, 8:21:07 AM
class Solution {
    public int missingNumber(int[] nums) {
        int val=0;
        for(int i=0;i<=nums.length;i++){
            val^=i;
        }
        for(int x:nums){
            val^=x;
        }
        return val;

       /* nums.sort();
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]!=i) return i;
        }*/

    }
}