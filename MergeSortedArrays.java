/*
    Leetcode problem 88: Merge Sorted Array
    T.C: O(m + n) :: S.C: O(1)

    Solved using Three Pointers: Place a pointer at the end of the resultant array
    (i.e. m + n - 1), another pointer at end of elements in first array m - 1 and
    the other pointer at the end of elements in the second array. Now compare the 
    elements from the first array and second array and place the larger element at
    the last position and decrement the pointers respectively. Handle the edge case
    of the second array's elements length being larger than the first array (i.e n > m).
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0) return;
        if (nums2 == null || n == 0) return;

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;                
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}