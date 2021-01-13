// Time Complexity : o(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
public class MergeTwoArrays {
	
	    public void merge(int[] nums1, int m, int[] nums2, int n) {
	        
	        if(nums1 == null || nums1.length == 0) return;
	        int p1 = m-1, p2= n-1, p = m+n-1;
	        
	        // run while loop until one of the pointers get out of bound
	        while(p1 >= 0 && p2 >=0) {
	            if(nums1[p1] >= nums2[p2]) {
	                nums1[p] = nums1[p1];
	                p1--;
	            } else {
	                nums1[p] = nums2[p2];
	                p2--;
	            }
	            p--;
	        }
	        
	        //check if any integeres there in p2 and move them to nums1 array.
	        while (p2 >= 0) {
	            nums1[p] = nums2[p2];
	            p2--; p--;
	        }
	    }
}
