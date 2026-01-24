// Last updated: 1/24/2026, 8:21:03 AM
class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for (char cs : s.toCharArray())
            c ^= cs;
        for (char ct : t.toCharArray())
            c ^= ct;
        return c;
    }
}