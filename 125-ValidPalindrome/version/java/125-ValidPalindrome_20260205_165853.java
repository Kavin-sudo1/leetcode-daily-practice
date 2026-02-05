// Last updated: 2/5/2026, 4:58:53 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        String cleaned=s.toLowerCase().replaceAll("[^a-z0-9]","");
4        StringBuilder rev=new StringBuilder();
5        for(char c:cleaned.toCharArray()){
6            rev.append(c);
7        }
8        String reverse=rev.reverse().toString();
9        if(reverse.equals(cleaned)) return true;
10        else return false;
11        
12    }
13}