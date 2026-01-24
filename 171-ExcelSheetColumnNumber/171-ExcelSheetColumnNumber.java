// Last updated: 1/24/2026, 8:21:19 AM
class Solution {
    public int titleToNumber(String co) 
    {
        int result=0;
        for(int i=0; i<co.length();i++){
            result=result*26+co.charAt(i)-64;
        }
        return result;
        
        
    }
}