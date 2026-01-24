// Last updated: 1/24/2026, 8:20:12 AM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int sum=arrivalTime+delayedTime;
        if(sum==24) return 0;
        if(sum>24) return (Math.abs(24-sum));
        
        return sum;

        
    }
}