class Solution {
    // Time Complexity : O(m+n), where m is length of nums1 and n is the length of nums2
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;

        int k = n+m-1;

        while(p1 >= 0 && p2 >= 0) {
            if(nums1[p1] > nums2[p2]) {
                nums1[k] = nums1[p1];
                p1--;
            } else {
                nums1[k] = nums2[p2];
                p2--;
            }
            k--;
        }

        while(p2 >= 0) {
            nums1[k] = nums2[p2];
            p2--;
            k--;
        }
    }
}