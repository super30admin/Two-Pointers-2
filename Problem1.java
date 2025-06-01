// Time Complexity: O(m + n)
// Space Complexity: O(1) 
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english: filling up indices from backwards in nums1

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tLen = m + n - 1; // last index to fill
        m--; // point to last actual element in nums1
        n--; // point to last actual element in nums2

        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[tLen--] = nums1[m--];
            } else {
                nums1[tLen--] = nums2[n--];
            }
        }

        // Copy remaining elements from nums2, if any
        while (n >= 0) {
            nums1[tLen--] = nums2[n--];
        }
    }
}
