// Last updated: 1/24/2026, 8:20:38 AM
class Solution {
    public int countOdds(int low, int high) { 
        return (low%2==0 && high%2==0)? (high-low)/2:((high-low)/2)+1; 
        
        
    }
}