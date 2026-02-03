// Last updated: 2/3/2026, 8:11:48 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ') count++;
            else if(count>0) break;
        }
        return count;
        
    }
}