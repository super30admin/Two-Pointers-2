// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int ptr1 = m - 1; // Pointer for the last element in nums1
        int ptr2 = n - 1; // Pointer for the last element in nums2
        int ptr3 = m + n - 1; // Pointer for the last position in nums1 where elements will be filled

        // Merge nums1 and nums2 from the end
        while (ptr1 >= 0 && ptr2 >= 0) {
            if (nums1[ptr1] > nums2[ptr2]) {
                // If the current element in nums1 is greater, place it in the last position of nums1
                nums1[ptr3] = nums1[ptr1];
                ptr1--;
            } else {
                // If the current element in nums2 is greater, place it in the last position of nums1
                nums1[ptr3] = nums2[ptr2];
                ptr2--;
            }
            ptr3--; // Move to the previous position in nums1 for the next element
        }

        // If there are remaining elements in nums2, place them in the beginning of nums1
        while (ptr2 >= 0) {
            nums1[ptr3] = nums2[ptr2];
            ptr2--;
            ptr3--;
        }
    }
}
