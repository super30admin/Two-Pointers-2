public class MergeSortedArray {
    /**
     * as arrays are sorted and extra space is given at the end of nums1, we can start at end of each of
     * the array placing the higher element in its correct position towards the end of nums1, we avoid
     * possibility of writing a result to an unprocessed element of nums1
     *
     * Time: O(m + n) Space: O(1)
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int idx = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums2[p2] >= nums1[p1]) {
                nums1[idx] = nums2[p2];
                p2--;
            } else {
                nums1[idx] = nums1[p1];
                p1--;
            }
            idx--;
        }

        while (p2 >= 0) {
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
    }
}
