// Last updated: 1/24/2026, 8:19:48 AM
class Solution {
    public String reversePrefix(String s, int k) {
        String first=new StringBuilder(s.substring(0,k)).reverse().toString();
        String second=s.substring(k);
        return(first+second);
        
    }
}