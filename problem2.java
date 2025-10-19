
// Time Complexity : O(m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

/*
 * Approach 
 * 
 * we are start from the back of nums1  and sorting array from max to min
 * and in case nums2 is still not placed in nums1 in the end we place the nums2 on nums1
 * 
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m - 1;
        int len2 = n - 1;
        int index = m + n - 1;
        while (0 <= len1 && 0 <= len2) {
            if (nums1[len1] > nums2[len2]) {
                nums1[index] = nums1[len1];
                index--;
                len1--;
            } else if (nums1[len1] <= nums2[len2]) {
                nums1[index] = nums2[len2];
                index--;
                len2--;
            }
        }
        while (len2 >= 0) {
            nums1[index] = nums2[index];
            len2--;
            index--;
        }

    }
}