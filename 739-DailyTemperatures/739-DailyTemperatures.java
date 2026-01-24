// Last updated: 1/24/2026, 8:20:53 AM
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> s= new Stack();
        int[] ans=new int[temp.length];
        for(int i=0;i<temp.length;i++){
            int x= temp[i];
            while(!s.empty()&& x>temp[s.peek()]){
                ans[s.peek()]=i-s.pop();

            }
            s.push(i);
        }
        return ans;
        
    }
}