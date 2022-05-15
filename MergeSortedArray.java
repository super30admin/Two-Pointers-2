class Solution {

    /**
     * 2 pointers, boath array ends. compare and add max in end.
     * 3rd pointer for index in final sorted array
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int idx = m + n - 1;

        while (idx >= 0 && p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[idx] = nums1[p1];
                p1--;
                idx--;
            } else if (nums1[p1] < nums2[p2]) {
                nums1[idx] = nums2[p2];
                p2--;
                idx--;
            } else {
                nums1[idx] = nums1[p1];
                p1--;
                idx--;
            }
        }

        while (p2 >= 0) {
            nums1[idx] = nums2[p2];
            idx--;
            p2--;
        }
    }
}
