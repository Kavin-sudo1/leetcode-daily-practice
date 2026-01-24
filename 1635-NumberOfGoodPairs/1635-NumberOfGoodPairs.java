// Last updated: 1/24/2026, 8:20:37 AM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap <Integer,Integer>map=new HashMap();
        int count=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            count+=map.getOrDefault(n,0);
            if(map.containsKey(n)) // or   map.put(n,map.getOrDefault(n,0)+1);
            map.put(n,map.get(n)+1);
            else
            map.put(n,1);

        }
        // int pars=0;
        // for(int n:map.values())
        // pars+=(n*(n-1))/2;
        return  count;

        
    }
}