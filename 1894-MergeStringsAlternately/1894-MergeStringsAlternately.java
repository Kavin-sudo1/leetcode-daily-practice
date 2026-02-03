// Last updated: 2/3/2026, 8:10:32 PM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder  mer= new StringBuilder();
        int maxlength=Math.max(word1.length(),word2.length());
        for(int i=0;i<maxlength;i++){
            if(i<word1.length()) mer.append(word1.charAt(i));
             if(i<word2.length()) mer.append(word2.charAt(i));
        }
        return mer.toString();

        
    }
}