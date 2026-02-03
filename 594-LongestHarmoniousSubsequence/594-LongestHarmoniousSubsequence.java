// Last updated: 2/3/2026, 8:11:16 PM
import java.util.HashMap;

class Solution {
    public int findLHS(int[] nums) {

        // Step 1: Create HashMap to store frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 2: Count frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxLength = 0;

        // Step 3: Check for harmonious pairs
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                int length = map.get(key) + map.get(key + 1);
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}
