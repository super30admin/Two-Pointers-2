/*
Time Complexity -> O(m+n)
Space Complecity -> O(1)
*/

class Solution21 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0) {
            return;
        }
        // Here we are going to have three pointers
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] < nums2[p2]) {
                nums1[p3] = nums2[p2];
                p3--;
                p2--;
            } else {
                nums1[p3] = nums1[p1];
                p3--;
                p1--;

            }

        }
        while (p2 >= 0) {
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }

    }
}