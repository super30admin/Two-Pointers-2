"""
problem_1: Remove Duplicates from Sorted Array
tc: O(n)
sc: O(1)
Approach: Maintain two pointers, slow and fast. Slow pointer points to the index where the next element should be placed.
"""

from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0

        slow = 1
        fast = 1
        count =1
        while fast < len(nums):
            if nums[fast] == nums[fast - 1]:
                count += 1
            else:
                count = 1

            if count <= 2:
                nums[slow] = nums[fast]
                slow += 1

            fast += 1

        return slow
