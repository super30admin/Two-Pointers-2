package com.ds.rani.twopointers;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * Note:
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * <p>
 * Example:
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * Output: [1,2,2,3,5,6]
 */

//Approach: Use to pointer approach, one pointer will point to the first arrays last element
// and second pointer will point to the last element of second array.
// compare element at both pointers and copy the bigger element among two at the last of first array and
// decrease one of the pointer whose element was greater

public class MergeSortedArrays {

    //Time complexity:o(m+n) where m and n ara both array size
    //Space complexity:o(1) as I am doing it in place

    /**
     * @param nums1 array one
     * @param m     size of array one
     * @param nums2 array 2
     * @param n     size of array 2
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;
        //start copying from end
        while (p1 >= 0 && p2 >= 0) {
            //if nums1 last element is greater than nums2 last element then copy nums1 last                 element to nums1[p3]
            if (nums1[p1] >= nums2[p2]) {
                nums1[p3--] = nums1[p1--];
            } else {
                nums1[p3--] = nums2[p2--];
            }
        }
        //copy remaining nums2 element into nums1
        while (p2 >= 0) {
            nums1[p3--] = nums2[p2--];
        }

    }

    private static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print( num + " " );
        }
    }

    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int nums2[] = {2, 5, 6};
        int n = 3;
        MergeSortedArrays.merge( nums1, m, nums2, n );
        printArray( nums1 );
    }

}
