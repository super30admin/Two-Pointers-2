// Time Complexity : O(m+n); m = nums1.length, n = nums2.length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length == 0) {
            return;
        }

        if(nums2 == null || nums2.length == 0) {
            return;
        }

        int ptr1 = m-1;
        int ptr2 = n-1;
        int i = m + n - 1;

        while(ptr1 >= 0 && ptr2 >= 0) {
            if(nums1[ptr1] >= nums2[ptr2]) {
                nums1[i] = nums1[ptr1];
                ptr1 -= 1;
                i -= 1;
            } else if(nums2[ptr2] > nums1[ptr1]) {
                nums1[i] = nums2[ptr2];
                ptr2 -= 1;
                i -= 1;
            }
        }

        while(ptr2 >= 0) {
            nums1[i] = nums2[ptr2];
            ptr2 -= 1;
            i -= 1;
        }
    }
}