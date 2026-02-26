// Last updated: 2/26/2026, 1:56:26 AM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        Arrays.sort(strs);
4        String s1=strs[0];
5        String s2=strs[strs.length-1];
6        int index=0;
7        while(index<s1.length() && index<s2.length()){
8            if(s1.charAt(index)== s2.charAt(index)) index++;
9            else break;
10
11        }
12        return s1.substring(0,index);
13        
14    }
15}