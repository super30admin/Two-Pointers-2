// Time Complexity : O(m+n) m is the length of array one and n is the length of array2
// Space Complexity : O(1) No extra space is used
// Did this code successfully run on Leetcode :

import java.util.Arrays;

public class mergeSortedArraySolution {
    public int[] mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {

        if (nums1 == null || nums1.length == 0) {
            return new int[0];
        }

        int pointerOne = m - 1;
        int pointerTwo = n - 1;
        int pointerThree = m + n - 1;

        while (pointerOne >= 0 && pointerTwo >= 0) {
            if (nums1[pointerOne] > nums2[pointerTwo]) {
                nums1[pointerThree] = nums1[pointerOne];
                pointerOne--;
            } else {
                nums1[pointerThree] = nums2[pointerTwo];
                pointerTwo--;
            }
            pointerThree--;
        }

        while (pointerTwo >= 0) {
            nums1[pointerThree] = nums2[pointerTwo];
            pointerTwo--;
            pointerThree--;
        }

        return nums1;

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int m = 3, n = 3;

        mergeSortedArraySolution mss = new mergeSortedArraySolution();

        System.out.println(Arrays.toString(mss.mergeSortedArray(nums1, m, nums2, n)));

    }
}
