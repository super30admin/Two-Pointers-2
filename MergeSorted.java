// In this approach, we are using 3 pointers, one pointing at the end of valid elements of nums1, one at the end of nums2, and one at
// the end of m+n array. Then we compare element at p1 in nums1 with element at p2 in nums2, since both are at the end, we know that 
// max of both will be the max of whole array, so place max(nums1[p1],nums2[p2]) at the position where p3 is, because p3 is at end of 
// m+n array. Then decrement the pointer which was having max value along with p3, and repeat same.

// Time Complexity : O(m+n) ==> m is number of element in nums1 and n is number of elements in nums2
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Base case
        if (nums1.length == 0 || nums1 == null) {
            return;
        }
        // Declaring 3 pointers, one at the end of valid elements of nums1, one at the
        // end of nums2, and one at the end of m+n array
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = (m + n) - 1;
        // Run a loop till we are out of elements in either nums1 or nums2
        while (p1 >= 0 && p2 >= 0) {
            // p3 index will hold the value that is max of both, since it is at m+n-1
            // position
            nums1[p3] = Math.max(nums1[p1], nums2[p2]);
            // Decrement p3 once the correct element is placed there
            p3--;
            // If nums1 element was higher, decrement p1
            if (nums1[p1] > nums2[p2]) {
                p1--;
            }
            // else p2
            else {
                p2--;
            }
        }
        // Check if there are still elements in nums2, then simply copy to nums1
        while (p2 >= 0) {
            nums1[p3] = nums2[p2];
            // Decrement both
            p2--;
            p3--;
        }
    }
}