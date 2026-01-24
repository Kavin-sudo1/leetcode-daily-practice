// Last updated: 1/24/2026, 8:21:02 AM
class Solution {
    public String toHex(int num) {
       // String hex = Integer.toHexString(num);
       if (num == 0) return "0";

        StringBuilder str = new StringBuilder();
        char[] hexChars = "0123456789abcdef".toCharArray();

        while (num != 0) {
            int rem = num & 15; // gets the last 4 bits (NOT num/16)
            str.append(hexChars[rem]); 
            num >>>= 4;         // shifts right by 4 bits (NOT num%16)
        }

        return str.reverse().toString(); 


        //return hex;

        
    }
}