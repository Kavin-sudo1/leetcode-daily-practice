// Last updated: 2/3/2026, 8:11:45 PM
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        
       if(len>=1){ for (int i = len - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] < 10) {
                
                return digits;
            }
           
            else digits[i] = 0;
        }
       } 
       
        int arr[]=new int[len+1];
        arr[1]=0;
        arr[0]=1;

        
        return arr;
    }
}