// Time Complexity : O(n+m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // `left` points to the last element of the initialized part of `nums1`
        int left = m - 1;
        // `right` points to the last position in `nums1`, which is the end of the merged array
        int right = nums1.length - 1;
        // `mid` points to the last element of `nums2`
        int mid = n - 1;

        // Merge `nums1` and `nums2` starting from the end
        while (left >= 0 && mid >= 0) {
            // Compare elements from the end of both arrays
            if (nums1[left] > nums2[mid]) {
                // If the element in `nums1` is greater, place it at the end of the merged array
                nums1[right] = nums1[left];
                // Move to the next element in `nums1`
                left--;
            } else {
                // If the element in `nums2` is greater or equal, place it at the end of the merged array
                nums1[right] = nums2[mid];
                // Move to the next element in `nums2`
                mid--;
            }
            // Move to the next position in the merged array
            right--;
        }

        // If there are remaining elements in `nums2`, copy them
        while (mid >= 0) {
            nums1[right] = nums2[mid];
            right--;
            mid--;
        }

        // No need to copy the remaining elements of `nums1` since they are already in place
    }
}
