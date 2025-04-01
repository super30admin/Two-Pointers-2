// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach - We use three pointers from the end of the two arrays and the end position of nums1.
//    - num1ptr points to the last valid element in nums1 (index m-1).
//    - num2ptr points to the last valid element in nums2 (index n-1).
//    - then compare nums1[num1ptr] and nums2[num2ptr]; whichever is larger goes into the end of nums1.
//    - then Move the corresponding pointer. Continue until nums2 is exhausted or fully merged into nums1.


import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1ptr = m - 1;
        int num2ptr = n - 1;

        for(int ptr = m + n - 1; ptr >= 0; ptr--) {
            if(num2ptr < 0) {//empty nums2 case
                break;
            }
            if(num1ptr >= 0 && nums1[num1ptr] > nums2[num2ptr]) {
                nums1[ptr] = nums1[num1ptr--];
            } else {
                nums1[ptr] = nums2[num2ptr--];
            }
        }
    }

    public static void main(String[] args) {
        MergeSortedArray solver = new MergeSortedArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solver.merge(nums1, m, nums2, n);
        System.out.println("Merged array 1: " + Arrays.toString(nums1));

        int[] nums3 = {4, 5, 6, 0, 0, 0};
        int m2 = 3;
        int[] nums4 = {1, 2, 3};
        int n2 = 3;

        solver.merge(nums3, m2, nums4, n2);
        System.out.println("\nMerged array 2: " + Arrays.toString(nums1));
    }
}
