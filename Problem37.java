// Time Complexity: O(m+n)
// Space Complexity: O(1)
// 88. Merge Sorted Array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // Pointer for the end of the valid elements in nums1
        int p2 = n - 1; // Pointer for the end of nums2
        int p = m + n - 1; // Pointer for the end of nums1

        // Merge in reverse order
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p--] = nums1[p1--];
            } else {
                nums1[p--] = nums2[p2--];
            }
        }

        // Copy remaining elements of nums2, if any
        while (p2 >= 0) {
            nums1[p--] = nums2[p2--];
        }
    }
}