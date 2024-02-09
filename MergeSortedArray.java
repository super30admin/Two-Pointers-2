// Time Complexity : O(m+n) - where m and n are the lengths of nums1 array and nums2 array
// Space Complexity : O(1)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
Approach -:
The fact here is array's should always be sorted.

I started filling the nums1 array from the end by comparing two pointers on the
m-1 and n-1 indexes of the nums1 and nums2 array (until one of the pointer crosses the boundary).

After that, if the pointer on the nums2 array is less than 0, we don't have to
anything, because the num1 array is already sorted. If not, we start injecting the
nums2 elements in the same indexes of the nums1 array.
 */

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int idx = nums1.length - 1;

        int i = m - 1, j = n - 1;

        while(i >= 0 && j >= 0) {
            if(nums1[i] < nums2[j]) {
                nums1[idx--] = nums2[j];
                j--;
            } else {
                nums1[idx--] = nums1[i];
                i--;
            }
        }

        while(j >= 0) {
            nums1[idx--] = nums2[j--];
        }
    }
}
