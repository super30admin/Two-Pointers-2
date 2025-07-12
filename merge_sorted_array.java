// In the solution, we use three pointers to merge two sorted arrays in-place
// TC: O(n) <-- merging in-place in one pass
// SC: O(1) <-- no additional space is required

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums2 == null) {
            return;
        }

        int index = m + n - 1; // Last index of nums1
        int p1 = m - 1;        // Last valid element in nums1
        int p2 = n - 1;        // Last element in nums2

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] < nums2[p2]) {
                nums1[index] = nums2[p2];
                p2--;
            } else {
                nums1[index] = nums1[p1];
                p1--;
            }
            index--;
        }

        // If any elements left in nums2, copy them
        while (p2 >= 0) {
            nums1[index] = nums2[p2];
            p2--;
            index--;
        }
    }
}
