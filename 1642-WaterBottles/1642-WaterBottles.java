// Last updated: 1/24/2026, 8:20:36 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            int newd=empty/numExchange;
            empty=empty%numExchange+(newd);
            drink+=newd;

        }
        return drink;

    }
}