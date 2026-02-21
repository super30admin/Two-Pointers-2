// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/*
Use 2 pointers to traverse from ends of both the arrays and compare the values at each iteration to know
the greater value and place it at the end of the first array using a 3rd pointer. This way, we can achieve
an array sorted in non-decreasing order.
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        for(int p = m + n - 1 ; p >= 0 ; p--) {
            if(p2 < 0)
                break;
            if(p1 >= 0 && nums1[p1] > nums2[p2])
                nums1[p] = nums1[p1--];
            else
                nums1[p] = nums2[p2--];
        }
    }
}