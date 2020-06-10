/** 
*
*
*Did this code successfully run on Leetcode : Yes
*
*Three line explanation of solution in plain english : 
*
*Two pointers -  
*
*Similar to merging sorted linked lists. 
*Start from end of two arrays and append elements from the right.
*
*Your code here along with comments explaining your approach
*
*/

//Merge and Sort- Time: O((m+n)\log{(m+n)}), Space-O(1)
class Solution{
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        	for (int i = 0; i < n; ++i) {
        	 	nums1[m + i] = nums2[i];
        	}
  	    	Arrays.sort(nums1);
	}
}

//Two pointer- Time: O(m+n), Space-O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int idx = m + n - 1; // to get the last index of array. 
        int end1 = m - 1; int end2 = n - 1; 
        
        while(idx >= 0){
            if( end1 >= 0 && end2 >= 0){
                if(nums1[end1] > nums2[end2]){ // pick end1
                    nums1[idx--] = nums1[end1--];
                }else{
                    nums1[idx--] = nums2[end2--];
                }
            }else if( end1 >= 0){
                	nums1[idx--] = nums1[end1--];
            	}else{ // end2 >= 0
                	nums1[idx--] = nums2[end2--];
            	}
        }
    }
}