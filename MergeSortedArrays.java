// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class MergeSortedArrays {
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int i=m-1;
	        int j=n-1;
	        int k=nums1.length-1;
	        while(i>=0 && j>=0){
	            if(nums1[i]>=nums2[j]){
	                nums1[k]=nums1[i];
	                i--;
	            }else{
	                nums1[k]=nums2[j];
	                j--;
	            }
	            k--;
	        }
	        
	        while(j>=0){
	            nums1[k]=nums2[j];
	            j--;
	            k--;
	        }
	 }
}
