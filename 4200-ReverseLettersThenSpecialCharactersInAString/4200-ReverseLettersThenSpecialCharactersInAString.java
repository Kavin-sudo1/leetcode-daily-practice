// Last updated: 2/3/2026, 8:10:05 PM
class Solution {
    public String reverseByType(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder special = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                letters.append(c);
            } else {
                special.append(c);
            }
        }

        letters.reverse();
        special.reverse();

        int i = 0, j = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result.append(letters.charAt(i++));
            } else {
                result.append(special.charAt(j++));
            }
        }

        return result.toString();
    }
}
