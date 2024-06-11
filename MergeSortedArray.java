class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2 == null || nums2.length == 0) {
            return;
        }

        int i = m - 1;
        int j = n - 1;
        int R = m + n - 1;

        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[R] = nums1[i];

                R--;
                i--;
            } else {
                nums1[R] = nums2[j];

                R--;
                j--;
            }
        }
        while(j >= 0) {
            nums1[R] = nums2[j];
            R--;
            j--;
        }
    }
}
