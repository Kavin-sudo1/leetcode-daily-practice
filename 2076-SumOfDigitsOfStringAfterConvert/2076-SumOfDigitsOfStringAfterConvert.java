// Last updated: 1/24/2026, 8:20:30 AM
class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {   // FIX: s.length()
            sb.append(s.charAt(i) - 96);        // FIX: charAt
        }

        for (int i = 0; i < k; i++) {

            sum = 0;                            // FIX: reset sum each loop

            for (int j = 0; j < sb.length(); j++) {   // FIX: start from 0, rename inner variable
                int d = sb.charAt(j) - '0';
                sum += d;
            }

            sb.delete(0, sb.length());
            sb.append(sum);
        }

        return sum;
    }
}