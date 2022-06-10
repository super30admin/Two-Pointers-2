public class Problem2 {

    // Time Complexity : O(n + m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
    // The main intuition here was to use the extra space given in nums1
    // to use that we need to push the largest element there
    // hence we start from the tails of the 2 array, keep pushing the larger element at the end of the nums1 and reducing the respective pointers
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m - 1;
            int j = n - 1;
            int k = m + n - 1;
            while (i >= 0 && j >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[k--] = nums1[i--];
                } else {
                    nums1[k--] = nums2[j--];
                }
            }

            while (j >= 0) {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
