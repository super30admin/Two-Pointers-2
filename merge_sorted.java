/**
 * Merges two sorted integer arrays nums1 and nums2 into a single sorted array
 * in-place.
 *
 * Problem:
 * - nums1 has a length of m + n, where the first m elements are valid and the
 * last n are zeros (placeholders).
 * - nums2 has n elements.
 * - Merge nums2 into nums1 so that nums1 becomes a single sorted array.
 *
 * Approach:
 * - Use three pointers starting from the end of both arrays and the end of the
 * result space (in nums1).
 * - Compare elements from the back of nums1 and nums2, and place the larger one
 * at the end.
 * - This avoids overwriting values in nums1 that haven't been compared yet.
 *
 * Time Complexity: O(m + n)
 * - Each element from nums1 and nums2 is visited once.
 *
 * Space Complexity: O(1)
 * - The merge is done in-place without using extra space.
 *
 */

public class merge_sorted {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1_1 = { 1, 2, 3, 0, 0, 0 };
        int m1 = 3;
        int[] nums2_1 = { 2, 5, 6 };
        int n1 = 3;
        merge(nums1_1, m1, nums2_1, n1);
        System.out.println(java.util.Arrays.toString(nums1_1)); // Expected: [1, 2, 2, 3, 5, 6]

        // Example 2
        int[] nums1_2 = { 1 };
        int m2 = 1;
        int[] nums2_2 = {};
        int n2 = 0;
        merge(nums1_2, m2, nums2_2, n2);
        System.out.println(java.util.Arrays.toString(nums1_2)); // Expected: [1]

        // Example 3
        int[] nums1_3 = { 0 };
        int m3 = 0;
        int[] nums2_3 = { 1 };
        int n3 = 1;
        merge(nums1_3, m3, nums2_3, n3);
        System.out.println(java.util.Arrays.toString(nums1_3)); // Expected: [1]
    }
}
