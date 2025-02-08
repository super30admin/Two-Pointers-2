// Overall Time Complexity : O(m+n) . The m represents number of elements in the first array  and n represents number of elements in the second array .
// Overall Space Complexity : O(1) . There no extra space taken in the problem.
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No issues faced during implementation


// This solution merges two sorted arrays using a two-pointer approach.  
// One pointer starts at the last valid element of `nums1`, and the other at the last element of `nums2`.  
// We compare elements from both arrays and place the larger one at the end of `nums1`.  
// If any elements remain in `nums2`, they are copied into `nums1`.

 

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;

        int idx = m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[idx] = nums1[i];
                i--;
            }
            else{
                nums1[idx] = nums2[j];
                j--;
            }
            idx--;
        }
        while(j>=0){
            nums1[idx] = nums2[j];
            j--;
            idx--;
        }
    }
}
