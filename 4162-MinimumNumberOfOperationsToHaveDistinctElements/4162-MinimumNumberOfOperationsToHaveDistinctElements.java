// Last updated: 1/24/2026, 8:19:50 AM
import java.util.*;

class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int i;

        
        for ( i = n - 1; i >= 0; i--) {
            if (set.contains(nums[i])) {
                break;
            }
            set.add(nums[i]);
        }

       
        if (i == -1) return 0;

        return (i + 3) / 3;   
    }
}
