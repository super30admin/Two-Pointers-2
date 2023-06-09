
// ## Problem2 (https://leetcode.com/problems/merge-sorted-array/)
// Time Complexity : O (n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Use two pointers which begin at last index of input arrays and compare the values at each point. Move the greater value in the larger input array, iterating from end to start.
import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int m1 = m - 1, n1 = n - 1;
        int len = m + n - 1;
        while (n1 >= 0) {
            if (m1 >= 0 && nums1[m1] > nums2[n1]) {
                nums1[len--] = nums1[m1--];
            } else {
                nums1[len--] = nums2[n1--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int m = 3, n = 3;
        MergeSortedArray obj = new MergeSortedArray();
        obj.merge(nums1, m, nums2, n);
        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }
}
