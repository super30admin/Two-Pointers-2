public class MergeSortedArray {
    // TC: O(N) where N is length of nums1
    // SC: O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, p = nums1.length - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums2[p2] > nums1[p1]) {
                nums1[p] = nums2[p2--];
            } else {
                nums1[p] = nums1[p1--];
            }
            p--;
        }
        while (p2 >= 0) {
            nums1[p] = nums2[p2--];
            p--;
        }
    }
}
