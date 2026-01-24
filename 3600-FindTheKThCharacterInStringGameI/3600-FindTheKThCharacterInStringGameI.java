// Last updated: 1/24/2026, 8:19:59 AM
class Solution {
    public char kthCharacter(int k) {
        //return (char)('a'+Integer.bitCount(k-1));
         String s = "a";
        
    while (s.length() < k) {
        StringBuilder temp = new StringBuilder();
        for ( int c=0;c< s.length();c++) {
            if (s.charAt(c) == 'z') {
                temp.append('a');
            }
            else {
                temp.append((char) ((s.charAt(c)) + 1));
            }
        }
        s += temp;
    }
        
     return s.charAt(k - 1);
    }
}