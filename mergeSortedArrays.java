// Time Complexity : O(m+n) where m and n are the lengths of the two arrays
// Space Complexity : O(1) as we are using constant space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * We use three pointers: two for traversing the input arrays from the end and one for placing elements in the merged array.
 * The idx is the pointer that points to the last position of nums1 where the next largest element should be placed.
 * We compare elements from the end of both arrays and place the larger one at the idx position, moving the respective pointer and idx backwards.
 * If there are remaining elements in nums2 after nums1 is exhausted, we copy them over or else they are already in place.
 */

class mergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1=m-1;
        int p2=n-1;
        int idx=m+n-1;

        while(p1>=0 && p2>=0)
        {
            if(nums1[p1]>nums2[p2])
            {
               nums1[idx] =nums1[p1];
               p1--;
            }
            else
            {
               nums1[idx] =nums2[p2];
               p2--;
            }
            idx--;
        }
        while(p2>=0)
        {
            nums1[idx]=nums2[p2];
            p2--;
            idx--;
        }
        return;
        
    }
}