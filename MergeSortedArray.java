// Time Complexity O(m+n)
// Space Complexity O(1)
// Runs on LeetCode YES
class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[i] = nums1[p1];
                p1--;
                i--;
            } else {
                nums1[i] = nums2[p2];
                p2--;
                i--;
            }
        }
        while (p2 >= 0) {
            nums1[i] = nums2[p2];
            p2--;
            i--;
        }
    }
}
