// TC: O(m + n)
// SC: O(1)
// Solved on Leetcode
// No problem faced
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n - 1;
        
        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[length] = nums1[m - 1];
                m--;
            } else {
                nums1[length] = nums2[n - 1];
                n--;
            }
            length--;
        }
        while (n > 0) {
            nums1[length] = nums2[n - 1];
            length--;
            n--;
        }
    }
}
