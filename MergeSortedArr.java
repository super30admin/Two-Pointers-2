
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// modifying nums1 array in-place by starting from the end and placing the larger element between
// the two arrays at the current index.

// Your code here along with comments explaining your approach

class MergeSortedArr {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // Pointer for the last element in nums1 (non-zero part)
        int p2 = n - 1; // Pointer for the last element in nums2
        int idx = m+n-1; // Pointer for the last position in nums1

        while (p1 >= 0 && p2 >= 0) {
            // Compare elements from the end and place the larger one at the current index
            if (nums1[p1] > nums2[p2]) {
                nums1[idx] = nums1[p1];
                p1--;
            } else {
                nums1[idx] = nums2[p2];
                p2--;
            }
            idx--;
        }

        // If there are still elements left in nums2, copy them over to nums1
        while (p2 >= 0) {
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
    }
}