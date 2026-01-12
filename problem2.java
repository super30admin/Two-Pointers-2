// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, just needed to merge from end to avoid overwriting nums1.


// Your code here along with comments explaining your approach in three sentences only
// Since nums1 has extra space at the end, I fill it from the back so existing values don't get overwritten.
// I compare nums1[m-1] and nums2[n-1] and place the bigger one at the end pointer.
// Continue until nums2 is fully placed, because remaining nums1 part is already in correct position.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}
