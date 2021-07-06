# Time Complexity : O(n) [n = numner of elements in list]
# 
# Space Complexity : O(1)
# 
# Did this code successfully run on Leetcode : Yes
# 
# Any problem you faced while coding this : No
# 
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        write = 0
        index = 1
        start, end = 0, 0
        while end < len(nums):
            if nums[start] == nums[end]:
                if end - start < 2: # The write is incremented and updated at most twice for the same character
                    nums[write] =  nums[start]
                    write+=1
                end+=1
            else:
                start=end
        return write