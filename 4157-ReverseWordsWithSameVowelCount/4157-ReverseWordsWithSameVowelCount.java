// Last updated: 1/24/2026, 8:19:53 AM
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");

        // Count vowels in the first word
        int targetVowels = countVowels(words[0]);

        // Process remaining words
        for (int i = 1; i < words.length; i++) {
            if (countVowels(words[i]) == targetVowels) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }

        return String.join(" ", words);
    }

    private int countVowels(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}