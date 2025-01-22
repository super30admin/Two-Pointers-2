class MergeSortedArraySolution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, p3 = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            int first = nums1[p1];
            int second = nums2[p2];
            nums1[p3] = Math.max(first, second);
            p3--;
            if (first > second) {
                p1--;
            } else {
                p2--;
            }
        }
        while (p2 >= 0) {
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }
    }
}