"""
## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
TC: O(N)
SC: O(1)
"""

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 0 or len(nums) == 1: return len(nums)
        
        count = 1
        k = 2
        
        # initialize slow and fast pointer
        slow = 1
        
        for i in range(1, len(nums)):
                
            if (nums[i] == nums[i - 1]):
                count += 1
                
            else:
                count = 1
                
            if count <= k:
                nums[slow] = nums[i]
                slow += 1
            
        return slow
            
        