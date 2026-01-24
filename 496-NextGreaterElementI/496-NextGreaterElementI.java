// Last updated: 1/24/2026, 8:20:57 AM
import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        Stack<Integer> s = new Stack<Integer>();
        
        int[] res = new int[nums1.length];
        Arrays.fill(res, -1);

        // Build mapping of next greater element for nums2
        for (int x : nums2) {
            while (!s.isEmpty() && x > s.peek()) {
                hm.put(s.pop(), x);
            }
            s.push(x);
        }

        // Fill result for nums1 using the hashmap
        for (int i = 0; i < nums1.length; i++) {
            if (hm.containsKey(nums1[i])) {
                res[i] = hm.get(nums1[i]);
            }
        }

        return res;
    }
}