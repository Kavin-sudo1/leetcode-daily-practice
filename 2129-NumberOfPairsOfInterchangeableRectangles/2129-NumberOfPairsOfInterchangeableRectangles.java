// Last updated: 1/24/2026, 8:20:27 AM
class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap <Double,Integer> map= new HashMap();
        long res=0;
        for(int [] r:rectangles){
            Double ratio=(double)r[0]/r[1];
            res+=map.getOrDefault(ratio,0);
            map.put(ratio,map.getOrDefault(ratio,0)+1);

        }
        return res;

        
    }
}