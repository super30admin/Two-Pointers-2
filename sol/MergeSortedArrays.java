package sol;

public class MergeSortedArrays {
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
	        
	        int k=m+n-1;
	        int j=n-1;
	        int i=m-1;
	        
	        while(j>=0&&i>=0){
	            
	            if(nums1[i]>nums2[j]){
	                
	                int temp=nums1[k];
	                nums1[k]=nums1[i];
	                nums1[i]=temp;
	                i--;
	                k--;
	                
	            }else{
	                 int temp=nums1[k];
	                nums1[k]=nums2[j];
	                nums2[j]=temp;
	                j--;
	                k--;
	            }
	            
	        }
	        
	        
	        while(j>=0){
	            
	            nums1[k]=nums2[j];
	            j--;
	            k--;
	        }
	        
	    }
}
