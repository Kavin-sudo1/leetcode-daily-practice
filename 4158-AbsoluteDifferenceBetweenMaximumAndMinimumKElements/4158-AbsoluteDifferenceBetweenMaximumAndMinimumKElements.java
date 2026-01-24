// Last updated: 1/24/2026, 8:19:52 AM
import java.util.Arrays;

class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;   // ✅ declare n
        int minSum = 0;
        int maxSum = 0;

        // sum of k smallest elements
        for (int i = 0; i < k; i++) {
            minSum += nums[i];
        }

        // sum of k largest elements
        for (int i = n - k; i < n; i++) {
            maxSum += nums[i];
        }

        return Math.abs(maxSum - minSum);
    }
}