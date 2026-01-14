"""
time - o(n)
space o(1)
keep two pointers (slow and fast), the slow pointer tracks the place where we copy the number and return the final size
the fast pointer keeps track of how many duplicates are there, if there are more than two, we just copy the number twice and move the
slow pointer
"""

from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        left = right = 0
        while right < len(nums):
            curr = nums[right]
            count = 0
            while right < len(nums) and nums[right] == curr:
                count += 1
                right += 1
            if count > 2:
                count = 2
            while count != 0:
                nums[left] = curr
                count -= 1
                left += 1
        return left
