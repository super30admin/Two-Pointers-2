"""
Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.

It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,0,1,1,1,1,2,3,3],

Your function should return length = 7, with the first seven elements of nums being modified to 0, 0, 1, 1, 2, 3 and 3 respectively.

It doesn't matter what values are set beyond the returned length.
Clarification:

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.

"""
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        """
        create two pointers compare the value left to the current pointer if its equal increment the count. Move p2 until we found p2 is less than our desired value 2 else we have replace the p2 with value in p1.
        """
        # Run time complexity : O(N)
        # Space Complexity : O(1)
        p2 = 1
        count = 1
        for p1 in range(1, len(nums)):
            if nums[p1] == nums[p1-1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[p2] = nums[p1]
                p2 += 1
        return p2