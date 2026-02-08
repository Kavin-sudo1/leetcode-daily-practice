// Last updated: 2/8/2026, 9:28:25 AM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3         HashMap<Integer,Integer> map=new HashMap();
4         for(int i=0;i<nums.length;i++){
5            int x=target-nums[i];
6            if(map.containsKey(x)) return new int[] {i,map.get(x)};
7            else map.put(nums[i],i);
8         }
9         return new int[]{-1,-1};
10
11        
12    }
13}