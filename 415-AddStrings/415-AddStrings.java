// Last updated: 1/24/2026, 8:21:01 AM

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1; 
         int carry = 0;
        int j = num2.length() - 1;
        while(i>=0 || j>=0 || carry>0){
        
        int d1=(i>=0)? num1.charAt(i)-'0':0;
        int d2=(j>=0)?num2.charAt(j)-'0':0;
        int sum=d1+d2+carry;
        sb.append(sum % 10);
         carry = sum / 10;
         i--;
        j--;
        }

        return sb.reverse().toString();
        // BigInteger a = new BigInteger(num1);
        
        // BigInteger b= new BigInteger(num2);
        // BigInteger c=a.add(b);
        // return c.toString();
        
        


    }
}