# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i,count = 1,1
        while i < len(nums):
            if nums[i] == nums[i-1]:
                count+=1
                if count > 2:
                    nums.pop(i)
                    i-=1
            else:
                count=1
            i+=1
        return len(nums)
