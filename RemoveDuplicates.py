"""Time Complexity: O(n)
Space Complexity: O(1)"""
from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums)== 0:
            return 0
        n = len(nums)
        j = 1
        count = 1
        for i in range(1,n):
            if nums[i] == nums[i-1]:
                count = count +1
            else:
                count = 1
            if count <= 2 :
                nums[j] = nums[i]
                j = j +1                         
        return j