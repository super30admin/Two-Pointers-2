'''

## Problem 80: Remove duplicates from sorted array II

## Author: Neha Doiphode
## Date:   07-12-2022

## Description
    Given an integer array nums sorted in non-decreasing order,
    remove some duplicates in-place such that each unique element appears at most twice.
    The relative order of the elements should be kept the same.

    Since it is impossible to change the length of the array in some languages,
    you must instead have the result be placed in the first part of the array nums.

    More formally, if there are k elements after removing the duplicates,
    then the first k elements of nums should hold the final result.
    It does not matter what you leave beyond the first k elements.

    Return k after placing the final result in the first k slots of nums.

    Do not allocate extra space for another array.
    You must do this by modifying the input array in-place with O(1) extra memory.

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

 ## Examples
        Example 1:
            Input: nums = [1,1,1,2,2,3]
            Output: 5, nums = [1,1,2,2,3,_]
            Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
                         It does not matter what you leave beyond the returned k (hence they are underscores).

        Example 2:
            Input: nums = [0,0,1,1,1,1,2,3,3]
            Output: 7, nums = [0,0,1,1,2,3,3,_,_]
            Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
                         It does not matter what you leave beyond the returned k (hence they are underscores).

## Constraints:
    1 <= nums.length <= 3 * 104
    -104 <= nums[i] <= 104
    nums is sorted in non-decreasing order.


## Time complexity: O(n), since i and j are only moving forward, they are not iterated repeatedly over same indices.

## Space complexity: O(1), No auxiliary space is used. Removal of duplicates is in-place.

'''
from typing import List

def get_input():
    print("Enter the array(with spaces): ", end = "")
    inp_list = input()
    inp_list = [int(value) for value in inp_list.split()]
    return inp_list


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        if len(nums) <= 2:
            return len(nums)

        i = 0
        anchor = 0
        j = i + 1

        # Now start looping
        while i < len(nums):
            # We want to move j until we find different element/non-duplicate element.
            while j < len(nums) and nums[j] == nums[j - 1]:
                j += 1

            # Once we find different element, we want to now replace previous duplicates
            if j - 2 >= 0 and nums[j - 1] == nums[j - 2]:
                nums[anchor] = nums[j - 1]
                nums[anchor + 1] = nums[j - 1]
                anchor = anchor + 2

            else:
                # If there is single element just copy that
                nums[anchor] = nums[j - 1]
                anchor += 1

            i = j
            j += 1

        return anchor

# Driver code
solution = Solution()
inp_array = get_input()
print(f"Input array: {inp_array}")
print(f"Output: {solution.removeDuplicates(inp_array)}")
