// Last updated: 1/24/2026, 8:20:56 AM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
       int[] res=new int[nums.length];
       int n=nums.length;
       Stack<Integer> s=new Stack();
       Arrays.fill(res,-1);
       for(int i=0;i<n*2;i++){
        int x=nums[i%n];
        while(!s.empty()&& x>nums[s.peek()]){
            res[s.peek()]=x;
            s.pop();
        }
        s.push(i%n);
       } 
       return res;

       
        /*int n=nums.length;
         int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=-1;
            for(int j=1;j<n;j++){
                if(nums[i]<nums[(i+j)%n]) ans[i]=nums[(i+j)%n];
                break;
            }
        }
        // int[] arr=new int[n*2];
        // for(int i=0;i<n;i++){
        //     arr[i]=arr[i+n]=nums[i];
        // }
        // int[] ans=new int[n];
        // for(int i=0;i<n;i++){
        //     ans[i]=-1;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(nums[i]<arr[j]){
        //             ans[i]=arr[j];
        //             break;
        //         }
        //     }
        // }
        return ans;*/
        
    }
}