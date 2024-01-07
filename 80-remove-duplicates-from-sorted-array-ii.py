
"""
80. Remove Duplicates from Sorted Array II
Medium
"""
from leetcode_runner import LeetCode, TestCase, Args
from typing import *

PROBLEM = """
Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
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
Output: 5
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Example 2:

Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7
Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

 
Constraints:

1 <= nums.length <= 3 * 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.


"""

class Solution:
    
    """
    Accepted
    Time Complexity :  O(n)
    Space Complexity : O(1)
    Did this code successfully run on Leetcode : Yes
    Memory: 19%
    Runtime: 15%
    
    Explanation: The intuition is to use the sorted property of the array. [1,1,1,2,2,3]
    We can iterate over the array and keep a count of the number of times a number has occurred.
    If the count is less than 2, we can place the number at the slow pointer and increment the slow pointer.
    If the count is greater than 2, we can ignore the number and move on.
    
    """
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1
        k = 2
        slow = 0
        i = 1
        while i < len(nums):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            if count <= k:
                slow += 1
                nums[slow] = nums[i]
            i += 1
        return slow + 1

LeetCode(PROBLEM, Solution).check()
