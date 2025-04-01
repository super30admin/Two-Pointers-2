// Time Complexity: O(m + n), where m and n are the lengths of nums1 and nums2 respectively.
// Space Complexity: O(1), since we are modifying nums1 in-place and not using any additional data structures.

// Leetcode Problem: https://leetcode.com/problems/merge-sorted-array/

/**
 * Merges two sorted arrays, nums1 and nums2, into nums1 in non-decreasing order.
 * Modifies nums1 in-place, assuming it has enough space to accommodate both arrays.
 * Uses a two-pointer approach to merge efficiently in O(m + n) time.
 */

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int index = nums1.length-1;

        while(p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[index] = nums1[p1];
                p1--;
                index--;
            }
            else {
                nums1[index] = nums2[p2];
                p2--;
                index--;
            }
        }
    }
}