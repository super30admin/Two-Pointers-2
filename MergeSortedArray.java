// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m - 1, ptr2 = n - 1, ptr = m + n - 1;
        while (ptr1 >= 0 && ptr2 >= 0) {
            if (nums1[ptr1] > nums2[ptr2]) {
                nums1[ptr] = nums1[ptr1];
                ptr1--;
            } else {
                nums1[ptr] = nums2[ptr2];
                ptr2--;
            }
            ptr--;
        }
        while (ptr2 >= 0) {
            nums1[ptr] = nums2[ptr2];
            ptr2--;
            ptr--;
        }
    }

}