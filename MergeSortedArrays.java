// Time Complexity: O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Approach
// took three pointers a, b and i
// a == length of m - 1
// b == length of n - 1
// i == m+n-1
// we compare the element from last and place them in the first array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0)
            return;
        int i = m + n - 1;
        int a = m - 1;
        int b = n - 1;

        while (a >= 0 && b >= 0) {
            if (nums1[a] > nums2[b]) {
                nums1[i] = nums1[a];
                a--;
            } else {
                nums1[i] = nums2[b];
                b--;
            }
            i--;
        }
        while (b >= 0) {
            nums1[i] = nums2[b];
            b--;
            i--;
        }
    }
}