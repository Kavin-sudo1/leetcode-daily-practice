// Last updated: 1/24/2026, 8:20:15 AM
class Solution {
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n);
        int sum=0;
        //int sumn=0;
        for(int i=0;i<s.length();i++){
            int digit = Integer.parseInt(String.valueOf(s.charAt(i)));// or s.charAt(i)-'0'
            if(i%2==0){
                sum-=digit;
            }
           else  sum+=digit;

        }
        return (-1*(sum));//(sumn-sum);
        
    }
}