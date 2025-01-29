// Approach: Start filling the first array from the end using three pointers: i, j, and k, which track the current elements in arr1,
// arr2, and the end of arr1, respectively. Compare the elements at i and j, placing the larger one at index k, and decrement the
// corresponding pointer. A key observation is that k is always greater than i, ensuring that the algorithm correctly merges both
// sorted arrays into the first array.
// Time Complexity: O(m + n) where m - arr1 size, n - arr2 size
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// https://leetcode.com/problems/merge-sorted-array/description/

import java.util.Arrays;

public class MergeSortedArrays {

    void mergeSortedArrays(int[] arr1, int[] arr2, int m, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }
    }

    void mergeUsingExtraSpace(int[] arr1, int[] arr2, int m, int n) {
        int[] temp = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < m) {
            if (arr1[i] < arr2[j]) {
                temp[k++] = arr1[i++];
            } else {
                temp[k++] = arr2[j++];
            }
        }
        while (i < m) {
            temp[k++] = arr1[i++];
        }
        while (j < n) {
            temp[k++] = arr2[j++];
        }
        for (i = 0; i < m + n; i++) {
            arr1[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        MergeSortedArrays msa = new MergeSortedArrays();
        int[] arr1 = { 1, 2, 3, 0, 0, 0 };
        int[] arr2 = { 2, 5, 6 };
        msa.mergeSortedArrays(arr1, arr2, arr1.length - arr2.length, arr2.length);
        System.out.println("Merged array: " + Arrays.toString(arr1));
    }
}