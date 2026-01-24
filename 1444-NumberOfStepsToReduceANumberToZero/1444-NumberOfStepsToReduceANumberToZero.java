// Last updated: 1/24/2026, 8:20:42 AM
class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num>0){
            if(num%2==0)  num=num/2;
            else num-=1;
            count++;
        }
        return count;
        
    }
}