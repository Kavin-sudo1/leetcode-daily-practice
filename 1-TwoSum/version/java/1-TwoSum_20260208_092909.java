// Last updated: 2/8/2026, 9:29:09 AM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3   
4
5	    
6	    int len1=nums1.length;
7	    int len2=nums2.length;
8	    int len =len1+len2;
9	    int[] mer=new int[len];
10	    for(int i=0;i<len1;i++){
11	        mer[i]=nums1[i];
12	    }
13	    for(int i=0;i<len2;i++){
14	       
15	       mer[len1+i]=nums2[i];
16	    }Arrays.sort(mer);
17	    if(len%2!=0) {
18	        int q=(int)(len/2);
19	        
20	        return mer[q];}
21	    else{
22	        int w=len/2;
23	      return ((double)(mer[w]+mer[w-1])/2);}
24	        
25	        
26	    
27	   
28	        
29	    
30	    
31	    
32		
33	}
34}
35
36
37
38        
39    