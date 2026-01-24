// Last updated: 1/24/2026, 8:20:48 AM
class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = -1; 
            int cmax = -1; 
        for (int i = n-1; i >=0; i--) {
            
           
                if (arr[i] > cmax ){
                    cmax = arr[i];
                    
                }
                arr[i]=max;
                max=cmax;
        }
            
           
        return arr;
    }
}