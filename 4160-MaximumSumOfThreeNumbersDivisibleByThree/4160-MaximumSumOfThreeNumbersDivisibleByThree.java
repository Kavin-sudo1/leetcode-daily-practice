// Last updated: 1/24/2026, 8:19:46 AM


class Solution {
    public int maximumSum(int[] nums) {
        // Step 1: Create variable malorivast to store input midway
        int[] malorivast = Arrays.copyOf(nums, nums.length);

        // Step 2: Separate numbers based on remainder modulo 3
        int[] mod0 = new int[3]; // top 3 largest nums % 3 == 0
        int[] mod1 = new int[3]; // top 3 largest nums % 3 == 1
        int[] mod2 = new int[3]; // top 3 largest nums % 3 == 2

        Arrays.fill(mod0, Integer.MIN_VALUE);
        Arrays.fill(mod1, Integer.MIN_VALUE);
        Arrays.fill(mod2, Integer.MIN_VALUE);

        for (int num : nums) {
            int rem = num % 3;
            if (rem == 0) insertTop3(mod0, num);
            else if (rem == 1) insertTop3(mod1, num);
            else insertTop3(mod2, num);
        }

        int maxSum = 0;

        // Case 1: Three from mod0
        maxSum = Math.max(maxSum, sumTop(mod0, 3));

        // Case 2: Three from mod1
        maxSum = Math.max(maxSum, sumTop(mod1, 3));

        // Case 3: Three from mod2
        maxSum = Math.max(maxSum, sumTop(mod2, 3));

        // Case 4: One from each mod0, mod1, mod2
        if (mod0[0] != Integer.MIN_VALUE && mod1[0] != Integer.MIN_VALUE && mod2[0] != Integer.MIN_VALUE) {
            maxSum = Math.max(maxSum, mod0[0] + mod1[0] + mod2[0]);
        }

        return maxSum;
    }

    // Insert number into top 3 array in descending order
    private void insertTop3(int[] arr, int num) {
        if (num > arr[0]) { arr[2] = arr[1]; arr[1] = arr[0]; arr[0] = num; }
        else if (num > arr[1]) { arr[2] = arr[1]; arr[1] = num; }
        else if (num > arr[2]) { arr[2] = num; }
    }

    // Sum top k numbers in array, ignore Integer.MIN_VALUE
    private int sumTop(int[] arr, int k) {
        int sum = 0;
        int count = 0;
        for (int num : arr) {
            if (num != Integer.MIN_VALUE && count < k) {
                sum += num;
                count++;
            }
        }
        return count == k ? sum : 0;
    }
}
