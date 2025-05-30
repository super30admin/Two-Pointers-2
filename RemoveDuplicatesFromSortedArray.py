# Time Complexity: O(N)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes

from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        # two pointer approach
        left = 1
        right = 1
        count = 1
        k = 2

        while right < len(nums):
            if nums[right] == nums[right - 1]:
                count += 1
            else:
                count = 1
            
            if count <= k:
                nums[left] = nums[right]
                left += 1
            
            right += 1

        return left