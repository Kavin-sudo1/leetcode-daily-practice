// Last updated: 2/3/2026, 8:12:04 PM
class Solution {
    public int reverse(int x) {
        int ori=x;
        //int y=Math.abs(x);
        long  sum=0;
        while(x>0 || x<0){
            int digit=x%10;
            sum=(sum*10)+digit;
            x=x/10;


        }

        return (sum<Integer.MAX_VALUE && sum>Integer.MIN_VALUE)? (int)sum: 0;
        
       
        

    }
}