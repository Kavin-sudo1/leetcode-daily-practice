// Last updated: 2/26/2026, 2:20:22 AM
1class Solution {
2    public boolean isPalindrome(int x) {
3        int ori=x;
4        int rev=0;
5        while(x>0){
6            int digit=x%10;
7            rev=(rev*10)+digit;
8            x/=10;
9        } 
10        if(ori==rev) return true;
11        else return false;
12        //return false;
13        
14        
15    }
16}