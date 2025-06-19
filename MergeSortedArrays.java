// Time Complexity: O(n) where n is the length of nums1 with extra zeroes. (In terms of input it would be equal to m + n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode: Yes

import java.util.Arrays;

class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = m + n - 1; // pointer to write elements starting from the end of nums1
        int p1 = m - 1; // pointer to track elements from the end of nums1
        int p2 = n - 1; // pointer to track elements from the end of nums2

        while (p1 >= 0 && p2 >= 0) {
            // add the greater element out of the two arrays tracked by p1 and p2 at idx
            if (nums2[p2] > nums1[p1]) {
                nums1[idx] = nums2[p2];
                p2--;
            }
            else {
                nums1[idx] = nums1[p1];
                p1--;
            }
            idx--;
        }
        // Transfer any remaining elements from nums2
        while (p2 >= 0) {
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
    }
}

class MergeSortedArraysRunner {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = new int[] { 2, 5, 6 };
        int n = 3;
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();

        mergeSortedArrays.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}