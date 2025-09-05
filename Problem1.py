"""
TC: O(N) {we iterate the list only once}
SC: O(1) {no use of any extra spaces}

Approach:

We initialize the placer counter at the start (0) and while iterating the list, we check if the curr element == prev element; if so
we increase the count by 1, else we reset the count to 1 (to count the curr new element count). Then we check if the count is less than
k (here its 2), if it is then we place the curr value in placer and update the placer by 1. In this way we will only put number in placer
]when their count is less than k (2 in this case).

The problem ran successfully on Leetcode.
"""

from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        placer = 0
        k = 2
        count = 0

        for i in range(len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            
            if count <= k:
                nums[placer] = nums[i]
                placer += 1
                
        return placer