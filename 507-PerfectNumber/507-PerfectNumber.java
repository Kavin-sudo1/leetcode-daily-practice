// Last updated: 1/24/2026, 8:20:55 AM
class Solution {
    public boolean checkPerfectNumber(int num) {
       // if(num==1) return false;
        int ori=num;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
                
                
            }
        }
        return (num==sum)? true:false;
        
    }
}