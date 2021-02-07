
// Time Complexity :O(n+m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Three line explanation of solution in plain english

/*we have 2 sorted arrays so we start comparing the lst elements 
of both arrays and store them in decreasing manner*/

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int total = m + n - 1;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] < nums2[n - 1]) {
                nums1[total] = nums2[n - 1];
                n--;
            } else {
                nums1[total] = nums1[m - 1];
                m--;
            }
            total--;
        }

        while (m > 0) {
            nums1[total] = nums1[m - 1];
            m--;
            total--;
        }

        while (n > 0) {
            nums1[total] = nums2[n - 1];
            n--;
            total--;
        }

    }
}