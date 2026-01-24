// Last updated: 1/24/2026, 8:21:11 AM
import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        for (int x : map.values()) {
            if(x!=0) return false;

        }
        return true;
        // if (s.length() != t.length()) {
        //     return false;
        // }

        // char[] sch = s.toCharArray();
        // char[] tch = t.toCharArray();

        // Arrays.sort(sch);
        // Arrays.sort(tch);

        // return Arrays.equals(sch, tch);
    }
}