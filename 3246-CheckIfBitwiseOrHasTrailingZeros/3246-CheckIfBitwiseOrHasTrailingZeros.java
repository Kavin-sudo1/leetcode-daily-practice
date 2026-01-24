// Last updated: 1/24/2026, 8:20:05 AM
class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) n++;
           
                
            
        }
        if(n>=2) return true;
        return false;
       
        
    }
}