// the idea is to maintain a pointer at the end of first array, and two more pointers where elements have ended in the given array.
// Compare the elements at the end and add the largest element to the end at the first pointer. 

// Time Complexity : O(m + n)
// Space Complexity : O(1)

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m - 1, ptr2 = n - 1;
        int i = m + n - 1;

        while (ptr1 >= 0 && ptr2 >= 0) {
            if (nums1[ptr1] > nums2[ptr2]) {
                nums1[i] = nums1[ptr1];
                ptr1--;
            } else {
                nums1[i] = nums2[ptr2];
                ptr2--;
            }
            i--;
        }

        while (ptr2 >= 0) {
            nums1[i--] = nums2[ptr2];
            ptr2--;
        }
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = new int[] { 2, 5, 6 };
        mergeSortedArray.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
