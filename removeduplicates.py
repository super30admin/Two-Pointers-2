##Time Complexity : O(n)
##Space Complexity :O(1)
##Did this code successfully run on Leetcode : Yes
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) < 3: return len(nums)
        
        slow = 2 
        for fast in range(2, len(nums)):
            if nums[slow-2] != nums[fast]: 
                nums[slow] = nums[fast]
                slow += 1
        
        for delete_index in range(fast, slow-1, -1):
            del nums[delete_index]
        
        return slow 