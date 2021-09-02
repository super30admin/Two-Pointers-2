// Time Complexity : O(m + n), m -> no. of elements in 1st array, n -> no. of elements in 2nd array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, p = m + n - 1;
        while(p >= 0) {
            if(p2 < 0)
                break;
            if(p1 >= 0 && nums2[p2] < nums1[p1]) {
                nums1[p] = nums1[p1];
                p1--;
                p--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
                p--;
            }
        }
    }
}