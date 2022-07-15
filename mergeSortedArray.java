// Time Complexity :O(m+n) where m is length of arr1 and n is length of arr2
// Space Complexity :constant
// Did this code successfully run on Leetcode :Yes


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m - 1;
        int ptr2 = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (ptr1 >= 0 && ptr2 >= 0) {
                if (nums1[ptr1] >= nums2[ptr2]) {
                    nums1[i] = nums1[ptr1];
                    ptr1--;
                } else {
                    nums1[i] = nums2[ptr2];
                    ptr2--;
                }
            }
        }
        if (ptr2 >= 0) {
            while (ptr2 >= 0) {
                nums1[ptr2] = nums2[ptr2];
                ptr2--;
            }
        }

    }
}