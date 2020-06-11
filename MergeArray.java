// Time Complexity : n^2(logn)
//Space Complexity : O(1) 
//Did this code successfully run on Leetcode : Yes

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    System.arraycopy(nums2, 0, nums1, m, n);
    Arrays.sort(nums1);
}
}