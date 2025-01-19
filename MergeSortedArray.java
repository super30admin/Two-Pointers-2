// TC: O (m + n)
// SC: O (1)

/*
 * Start from the end of each array. At each step, take the greater
 * element and place it at the third pointer and decrement the third pointer
 * and the picked element pointer. At the end, if there are elements remaining
 * in the second array, copy those over.
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
