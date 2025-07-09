/*80. Remove Duplicates from Sorted Array II
Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
Return k after placing the final result in the first k slots of nums.
Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
Custom Judge:
The judge will test your solution with the following code:
int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length
int k = removeDuplicates(nums); // Calls your implementation
assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.
Example 1:

Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Constraints:

1 <= nums.length <= 3 * 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
 */

/*Time Complexity:O(n)
Space Complexity:O(1)
Approach:Use two pointers. Traverse the sorted array and allow each number to appear at most twice. Track how many times the current number has appeared using a counter. If it's ≤2, copy it forward using a separate pointer j. This ensures in-place removal of extra duplicates.*/
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        // Edge case: if the array is null or empty, return 0
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 1;// Tracks how many times the current element has appeared
        int j = 1; // Points to the position where the next valid element should go
        // Start from the second element
        for (int i = 1; i < nums.length; i++) {
            // If current is same as previous, increment count
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {// If it's a new number, reset count to 1
                count = 1;
            }

            if (count <= 2) { // If the count is ≤ 2, we keep the number
                nums[j] = nums[i];// Place valid element at position j
                j++; // Move to next position
            }
        }
        return j;// j is the new length of the array with duplicates allowed at most twice

    }
}