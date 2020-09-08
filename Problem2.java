
public class Problem2 {
	
	//Time:O(n)
	//Space :O(1)
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int onept=m-1;
	        int twopt=n-1;
	        int index=m+n-1;
	        while(onept>=0 && twopt>=0){
	            if(nums1[onept]<nums2[twopt]){
	                nums1[index]=nums2[twopt];
	                twopt--;
	                
	            }else{
	                nums1[index]=nums1[onept];
	                onept--;
	            }
	            index--;
	        }
	        
	        while(twopt>=0){
	            nums1[index]=nums2[twopt];
	            index--;
	            twopt--;
	            
	        }
	        
	        
	    }
}
