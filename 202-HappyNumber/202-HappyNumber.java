// Last updated: 1/24/2026, 8:21:13 AM
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getsquare(n);

       
        while ( slow != fast) {
            slow = getsquare(slow);                
            fast = getsquare(getsquare(fast));     
        }

        return fast == 1;
    }

    public static int getsquare(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}