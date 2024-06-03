// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// logic: Initialize Pointers:  p1 points to the last element in the initial part of nums1.
//p2 points to the last element in nums2.
//p3 points to the last element in the merged array in nums1.
//Merge from Back to Front: Compare elements pointed to by p1 and p2.
//Place the larger element at the position pointed to by p3.
//Move the pointers accordingly.
//Continue this process until either p1 or p2 is exhausted.
//Copy Remaining Elements: If there are remaining elements in nums2, copy them to nums1.

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0) {
            return;  // Return if nums1 is null or empty
        }

        int p1 = m - 1;  // Pointer to the last element in the initial part of nums1
        int p2 = n - 1;  // Pointer to the last element in nums2
        int p3 = m + n - 1;  // Pointer to the last element in nums1 (merged array)

        // Merge nums1 and nums2 from the back to the front
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p3] = nums1[p1];  // Place nums1[p1] at nums1[p3]
                p1--;
            } else {
                nums1[p3] = nums2[p2];  // Place nums2[p2] at nums1[p3]
                p2--;
            }
            p3--;
        }

        // Copy remaining elements of nums2 to nums1 (if any)
        while (p2 >= 0) {
            nums1[p3] = nums2[p2];
            p3--;
            p2--;
        }
    }
}
