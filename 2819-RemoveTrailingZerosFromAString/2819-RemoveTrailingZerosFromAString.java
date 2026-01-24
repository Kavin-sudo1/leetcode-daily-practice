// Last updated: 1/24/2026, 8:20:09 AM
class Solution {
    public String removeTrailingZeros(String num) {
        int i=num.length()-1;
        while(i>=0 && num.charAt(i)=='0'){
            i--;
        }
        return num.substring(0,i+1);

    }
}