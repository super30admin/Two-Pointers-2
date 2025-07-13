// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to revise basic syntax

// ## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

// Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice.
// The relative order of the elements should be kept the same.
// Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
// More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
// Return k after placing the final result in the first k slots of nums.
// Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

// Custom Judge:
// The judge will test your solution with the following code:
// int[] nums = [...]; // Input array
// int[] expectedNums = [...]; // The expected answer with correct length
// int k = removeDuplicates(nums); // Calls your implementation
// assert k == expectedNums.length;
// for (int i = 0; i < k; i++) {
//     assert nums[i] == expectedNums[i];
// }
// If all assertions pass, then your solution will be accepted.

// Example 1:
// Input: nums = [1,1,1,2,2,3]
// Output: 5, nums = [1,1,2,2,3,_]
// Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).

// Constraints:
// 1 <= nums.length <= 3 * 104
// -104 <= nums[i] <= 104
// nums is sorted in non-decreasing order.

class Solution {
    public int removeDuplicates(int[] nums) {
        // Base Case: input array is null or empty
        if (nums == null || nums.length == 0){
            return 0;
        }

        int left = 0; // pointer for the position to place the next valid element
        int count = 0; // counter to track how many times the current element has appeared

        for (int right = 1; right < nums.length; right++){
            if(nums[left] != nums[right]){
                // found a new element
                left++;
                nums[left] = nums[right];
                count = 0; // reset count for new element
            }
            else if (nums[left] == nums[right] && count < 1){
                // allowing one duplicate
                count++;
                nums[++left] = nums[right];
            }
            // if count >= 1, skip placing the duplicate
        }

        // returning new length of the modified array
        return left + 1;
    }
}
