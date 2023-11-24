// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

/**
 * Since the size of nums1 is m+n, maintain a high pointer at m+n-1 (end of result array). Maintain 2 more pointers at the end of nums1 and nums2. Compare the elements at these
 * 2 pointers. Greater element will be copies to high pointer and decrement the respective array pointer and high pointer. Do this until all the elements of one of the array
 * is copied. After that, copy the remaining elements from the other array.
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int high = m+n-1;

        while(m > 0 && n > 0) {
            if(nums1[m-1] > nums2[n-1]) {
                nums1[high] = nums1[m-1];
                high--;
                m--;
            }
            else {
                nums1[high] = nums2[n-1];
                high--;
                n--;
            }
        }

        if(n > 0) {
            for(int i = high; i>=0; i--) {
                nums1[i] = nums2[n-1];
                n--;
            }
        }

        /*Not needed because nums1 itself is the result array. If until this point some of the elements are
        not traversed in nums1, then those are the smallest elements in the array and at its final position.*/
/*        if(m > 0) {
            for(int i = high; i>=0; i--) {
                nums1[i] = nums1[m-1];
                m--;
            }
        }*/
    }
}