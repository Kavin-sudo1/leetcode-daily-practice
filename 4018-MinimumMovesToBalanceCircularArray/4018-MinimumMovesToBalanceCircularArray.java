// Last updated: 1/24/2026, 8:19:56 AM
class Solution {
    public long minMoves(int[] balance) {
        int n = balance.length;
        int neg = -1;
        long total = 0;

        // Find negative index and total sum
        for (int i = 0; i < n; i++) {
            total += balance[i];
            if (balance[i] < 0) {
                neg = i;
            }
        }

        //ssible case
        if (total < 0) return -1;

        // No negative balance
        if (neg == -1) return 0;

        long need = -balance[neg];
        long moves = 0;

        // Take from closest neighbors first
        for (int d = 1; d < n && need > 0; d++) {
            int left = (neg - d + n) % n;
            int right = (neg + d) % n;

            if (balance[left] > 0) {
                long take = Math.min(balance[left], need);
                moves += take * d;
                need -= take;
            }

            if (need > 0 && right != left && balance[right] > 0) {
                long take = Math.min(balance[right], need);
                moves += take * d;
                need -= take;
            }
        }

        return need == 0 ? moves : -1;
    }
}