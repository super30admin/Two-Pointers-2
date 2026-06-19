// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Start from the end of both sorted arrays and compare the largest remaining elements.
// Place the larger element at the last available position in nums1 and move the corresponding pointer.
// Continue until all elements from nums2 are merged, producing a fully sorted array in-place.

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;

        while(p1 >= 0 && p2 >= 0) {
            if(nums2[p2] >= nums1[p1]) {
                nums1[p3--] = nums2[p2--];
            } else {
                nums1[p3--] = nums1[p1--];
            }
        }

        while(p2 >= 0) {
            nums1[p3--] = nums2[p2--];
        }
    }
}