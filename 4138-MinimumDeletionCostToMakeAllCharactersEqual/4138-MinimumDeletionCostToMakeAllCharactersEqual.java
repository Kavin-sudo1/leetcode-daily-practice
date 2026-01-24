// Last updated: 1/24/2026, 8:19:55 AM
class Solution {
    public long minCost(String s, int[] cost) {

        String serivaldan = s;

        long totalCost = 0;
        long[] keep = new long[26];

        for (int i = 0; i < serivaldan.length(); i++) {
            int idx = serivaldan.charAt(i) - 'a';
            keep[idx] += cost[i];
            totalCost += cost[i];
        }

        long maxKeepCost = 0;
        for (long val : keep) {
            maxKeepCost = Math.max(maxKeepCost, val);
        }

        return totalCost - maxKeepCost; 
    }
}
