// Time Complexity : O(m + n) // We go through both arrays once
// Space Complexity : O(1)    // We merge in-place without extra arrays
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach :
// 1. Use three pointers: p1 (last index of nums1's real elements), p2 (last index of nums2), and index (last position in nums1).
// 2. Compare nums1[p1] and nums2[p2], place the bigger one at nums1[index], and move pointers accordingly.
// 3. If nums2 still has remaining elements, copy them over (no need to handle nums1 leftovers because they are already in place).


public class MergeTwoSorted {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // last element in nums1's valid part
        int p2 = n - 1; // last element in nums2
        int index = nums1.length - 1; // fill position from the end

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[index] = nums1[p1];
                p1--;
            } else {
                nums1[index] = nums2[p2];
                p2--;
            }
            index--;
        }

        // Copy any remaining nums2 elements
        while (p2 >= 0) {
            nums1[index] = nums2[p2];
            p2--;
            index--;
        }
    }
}
