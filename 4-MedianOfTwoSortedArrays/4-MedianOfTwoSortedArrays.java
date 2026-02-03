// Last updated: 2/3/2026, 8:12:05 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
   

	    
	    int len1=nums1.length;
	    int len2=nums2.length;
	    int len =len1+len2;
	    int[] mer=new int[len];
	    for(int i=0;i<len1;i++){
	        mer[i]=nums1[i];
	    }
	    for(int i=0;i<len2;i++){
	       
	       mer[len1+i]=nums2[i];
	    }Arrays.sort(mer);
	    if(len%2!=0) {
	        int q=(int)(len/2);
	        
	        return mer[q];}
	    else{
	        int w=len/2;
	      return ((double)(mer[w]+mer[w-1])/2);}
	        
	        
	    
	   
	        
	    
	    
	    
		
	}
}



        
    