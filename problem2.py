#Time Complexity : O(n)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode :Yes
#Any problem you faced while coding this :No

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 0
        i = 0
        while i < len(nums):
            if count >= 2:
                if len(nums) - i > 1 and nums[i] != nums[i+1]:
                    count = 0
                nums.remove(nums[i])
            else:
                    if len(nums) - i > 1 and nums[i] == nums[i+1]:
                        count += 1
                    else:
                        count = 0
                    i += 1
        return len(nums)
