// Last updated: 2/26/2026, 2:19:53 AM
1class Solution {
2    public int reverse(int x) {
3        int ori=x;
4        //int y=Math.abs(x);
5        long  sum=0;
6        while(x>0 || x<0){
7            int digit=x%10;
8            sum=(sum*10)+digit;
9            x=x/10;
10
11
12        }
13
14        return (sum<Integer.MAX_VALUE && sum>Integer.MIN_VALUE)? (int)sum: 0;
15        
16       
17        
18
19    }
20}