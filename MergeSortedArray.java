// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to revise basic syntax

// ## Problem2 (https://leetcode.com/problems/merge-sorted-array/)

// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.
// The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
// To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and 
// the last n elements are set to 0 and should be ignored. nums2 has a length of n.

// Example 1:
// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.


// Example 2:
// Input: nums1 = [1], m = 1, nums2 = [], n = 0
// Output: [1]
// Explanation: The arrays we are merging are [1] and [].
// The result of the merge is [1].

// Constraints:
// nums1.length == m + n
// nums2.length == n
// 0 <= m, n <= 200
// 1 <= m + n <= 200
// -109 <= nums1[i], nums2[j] <= 109

// Follow up: Can you come up with an algorithm that runs in O(m + n) time?

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Base Case: if nums1 is empty or null
        if (nums1 == null || nums1.length == 0){
            return;
        }

        int p1 = m - 1; // pointer to end of valid elements in nums1
        int p2 = n - 1; // pointer to end of nums2
        int p3 = m + n - 1; // pointer to end of merged array in nums1

        // merge from end to avoid overwriting values in nums1
        while (p1 >= 0 && p2 >= 0){
            // placing the larger of two elements at the current position of p3
            nums1[p3] = Math.max(nums1[p1], nums2[p2]);
            p3--;

            // moving the pointer of the array from which the value was taken
            if (nums1[p1] > nums2[p2]){
                p1--;
            }
            else {
                p2--;
            }
        }

        // copying the remaining elements from nums2 if any
        while (p2 >= 0){
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }

    }
}