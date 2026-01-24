// Last updated: 1/24/2026, 8:17:38 AM
class Solution {
    public int vowelConsonantScore(String s) {
        int vcount=0;
        int ccount=0;
        for(int a=0;a<s.length();a++){
        char i=s.charAt(a);
            if(i=='a'||i=='e'||i=='i'|| i=='o'|| i=='u') vcount++;
            else if(i>='a' && i<='z') ccount++;
            }
        if (ccount==0) return 0;
        return (vcount/ccount);
        
    }
}