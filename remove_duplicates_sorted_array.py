# Time Complexity : O(n) because we are iterating through the array once
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
"""
In this code we are removing more than 1 duplicate values in the array by creating two pointers. 
The left pointer keeps track of the index where we need to insert the next legitimate value and 
the right pointer keeps track of the index where we are currently iterating. We also keep track 
of the number of duplicates we have seen so far.
"""

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0

        if len(nums) == 1:
            return 1

        left = 1
        repeat = 0

        for right in range(1, len(nums)):
            if nums[right] == nums[left - 1]:
                if repeat == 0:
                    repeat = 1
                    nums[left] = nums[right]
                    left += 1
            else:
                repeat = 0
                nums[left] = nums[right]
                left += 1

        return left