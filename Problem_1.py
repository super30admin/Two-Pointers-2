# 80. Remove Duplicates from Sorted Array II

# code: Approach in comments

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # Check for base conditions
        if not nums:
            return 0
        if len(nums)==1:
            return 1
        
        # since we can have at most twice repeated. ignore the first two indexes
        x = 2
        
        for i in range(2, len(nums)):
            if nums[x-2]!=nums[i]:
                nums[x] = nums[i]
                x+=1
        
        return x

# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES.