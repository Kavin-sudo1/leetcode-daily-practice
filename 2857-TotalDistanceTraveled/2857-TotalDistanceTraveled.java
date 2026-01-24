// Last updated: 1/24/2026, 8:20:08 AM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int tot=0;
        while(mainTank>=5){
            tot+=5;
            mainTank-=5;
            if(additionalTank>=1){
                mainTank++;
                additionalTank--;
            }
            
        }
        return (tot*10)+(mainTank*10);
       // if(mainTank>=5){
        //   return (mainTank+(Math.min(((mainTank-1)/4),additionalTank)))*10;
        //}
       // return mainTank*10;

        
    }
}