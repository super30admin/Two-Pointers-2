
// Time Complexity :    O(m + n) where m and n are the lengths of nums1 and nums2 respectively
// Space Complexity :   O(1) as we are using constant space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// We use three pointers i, j, and k to traverse nums1, nums2, and the merged array respectively.
// We compare elements at i and j and place the larger element at position k.
// We continue this process until we have merged all elements from both arrays.
// If there are remaining elements in nums2, we copy them to nums1. This way, we merge the two sorted arrays in-place without using extra space.
// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {

            if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        // copy remaining elements from nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}