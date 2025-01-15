import java.util.Arrays;
import java.util.List;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function,
 * but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements
 * denote the elements that should be merged, and the last n elements are set
 * to 0 and should be ignored. nums2 has a length of n.
 * <p>
 * Time Complexity: O(m+n), where m is size of first array and n is size of second array
 * Space Complexity: O(1)
 * Ran on leetcode? Yes
 * Issues faced? No
 *
 * Approach:
 * 1. Uses three pointers:
 *   - p1 for the last valid element in nums1,
 *   - p2 for the last element in nums2,
 *   - p3 for the last position in the merged array.
 * 2. Starting from the end, it compares elements and
 * places the larger one in nums1[p3], then decrements the pointers.
 * 3. Any remaining elements in nums2 are copied to nums1
 */
public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0)
            return;

        int p1 = m - 1; // points to the last valid element in nums1
        int p2 = n - 1; // points to the last element in nums2
        int p3 = m + n - 1; // points to the last position in the merged array

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p3--] = nums1[p1--]; // Place nums1[p1] and move both p1 and p3 left.
            } else {
                nums1[p3--] = nums2[p2--]; // Place nums2[p2] and move both p2 and p3 left.
            }
        }

        // If there are remaining elements in nums2, copy them to nums1.
        // No need to check nums1 since its elements are already in place.
        while (p2 >= 0) {
            nums1[p3--] = nums2[p2--];
        }
    }

    public static void main(String[] args) {
        MergeSortedArrays obj = new MergeSortedArrays();
        int[] nums1 = {2, 4, 5, 0, 0};
        int[] nums2 = {1, 8};
        obj.merge(nums1, 3, nums2, 2);
        System.out.println(Arrays.toString(nums1));
    }
}
