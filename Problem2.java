/*
Time Complexity:O(m+n)
Space Complexity:O(1)
Approach:We merge nums2 into nums1 starting from the end to avoid overwriting values. Use three pointers:
i for the last element in nums1 (excluding placeholders), j for the last element in nums2, k for the last position in nums1.
Compare nums1[i] and nums2[j]. Place the larger one at nums1[k] and move the pointers accordingly. Continue until all elements from nums2 are merged.
Remaining elements in nums1 are already in place, so we only copy leftover elements from nums2 if any
 */
class Problem2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0) {
            return;
        }
        int i = m - 1; // Index for nums1
        int j = n - 1; // Index for nums2
        int k = m + n - 1; // Index for the merged array (nums1)
        // Compare elements from the back and place the larger one at the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {// Place nums1[i] at the end
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];// Place nums2[j] at the end
                j--;
            }
            k--;// Move backward in merged array
        }

        // If any elements left in nums2, copy them (nums1's leftover are already in
        // place)
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}