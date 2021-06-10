// TC: O(m + n)
// SC: O(1)
class Solution {
    private void rightShift(int[] nums1, int m, int start) {
        for(int i = m; i > start; i--) {
            nums1[i] = nums1[i - 1];
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i, j;
        i = 0;
        j = 0;
        while(i < m && j < n) {
            if(nums1[i] > nums2[j]) {
                rightShift(nums1, m, i);
                nums1[i] = nums2[j];
                j++;
                m++;
            }
            i++;
        }
        while(j < n) {
            nums1[i] = nums2[j];
            i++;
            j++;
        }
    }
}