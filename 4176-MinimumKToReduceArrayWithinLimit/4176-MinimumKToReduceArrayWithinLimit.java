// Last updated: 2/3/2026, 8:10:02 PM
class Solution {
    public int minimumK(int[] nums) {
        int left = 1, right = 0;

        for (int i : nums)
            right = Math.max(right, i);
        right = Math.max(right, nums.length);

        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long temp = 0;

            for (int i : nums) {
                temp += (i + mid - 1) / mid;
                if (temp > (long) mid * mid)
                    break;
            }

            if (temp <= (long) mid * mid) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}