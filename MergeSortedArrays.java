// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Here we will be using 2 pointers starting both the pointers at the last index of both the arrays and then start comparing the 2 values of the respective arrays. This way we will keep on putting the values in the sorted order and in the end whatever are going to be the remaining values we are simply going to append them as it is.
public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // Pointer for nums1
        int p2 = n - 1; // Pointer for nums2
        int idx = m + n - 1; // Index for the merged array

        // Merge nums1 and nums2 from the end
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[idx--] = nums1[p1--];
            } else {
                nums1[idx--] = nums2[p2--];
            }
        }

        // Copy remaining elements from nums2 to nums1 (if any)
        while (p2 >= 0) {
            nums1[idx--] = nums2[p2--];
        }
    }
}
