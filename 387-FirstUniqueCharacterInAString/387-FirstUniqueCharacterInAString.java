// Last updated: 1/24/2026, 8:21:04 AM
class Solution {
    public int firstUniqChar(String s) {
       /*// for (int i = 0; i < s.length(); i++) 
       for (char c : s.toCharArray()){
            //char c = s.charAt(i);
            int index = s.indexOf(c);
            int lastIndex = s.lastIndexOf(c);
            if (index == lastIndex)
                return index;
        }
        return -1;*/
        
        int[] freq = new int[123]; 
        
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) ]++;
        }

        
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) ] == 1) {
                return i;
            }
        }


        return -1;
    }
}
    