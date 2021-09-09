public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pt1 = m - 1;
        int pt2 = n - 1;
        int i = m + n - 1;
        while (pt1 >= 0 && pt2 >= 0) {
            if (nums1[pt1] > nums2[pt2]) {
                nums1[i] = nums1[pt1];
                pt1--;
            } else {
                nums1[i] = nums2[pt2];
                pt2--;
            }
            i--;
        }
        while (pt2 >= 0) {
            nums1[i] = nums2[pt2];
            pt2--;
            i--;
        }
    }
}
// Tc: O(n) Sc:O(1)
