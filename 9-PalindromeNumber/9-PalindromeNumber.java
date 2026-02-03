// Last updated: 2/3/2026, 8:12:02 PM
class Solution {
    public boolean isPalindrome(int x) {
        int ori=x;
        int rev=0;
        while(x>0){
            int digit=x%10;
            rev=(rev*10)+digit;
            x/=10;
        } 
        if(ori==rev) return true;
        else return false;
        //return false;
        
        
    }
}