// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Solution: Two Pointer
// TC: O(N)
// SC: O(1)


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length == 0) return;

        // start from last index of nums1
        int k = nums1.length - 1;
        int i = m - 1;
        int j = n - 1;

        while(i >= 0 && j >= 0) {

            // put bigger value at k position and move k backward
            if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // some elements in nums2 might be remaining so put those in nums1
        while(j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        // we don't need to do while loop for nums1 remaining elements because it's already sorted from 0 till k
    }
}