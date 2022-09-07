//Problem2- https://leetcode.com/problems/merge-sorted-array/

// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english - We took 3 pointer approach and started comparing from larger number from both the array. Which even number is larger, we replace it with our high1 pointer and decrease that index & high1. If both are equal, we can decrease any index.

public class problem2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int low1 = m - 1;
        int high2 = n - 1;

        int high1 = m + n - 1;

        while (low1 >= 0 && high2 >= 0) {
            if (nums1[low1] > nums2[high2]) {
                nums1[high1] = nums1[low1];
                low1--;
                high1--;
            } else {
                nums1[high1] = nums2[high2];
                high2--;
                high1--;
            }
        }
        while (high2 >= 0) {
            nums1[high1] = nums2[high2];
            high2--;
            high1--;
        }
    }
}
