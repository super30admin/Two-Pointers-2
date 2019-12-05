# Runs on Leetcode
# Time complexity :  O(n)
# Memory complexity : O(1)

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) < 3:
            return len(nums)
        first  = 1
        while (first < len(nums)-1):
            if nums[first-1] == nums[first+1]:
                del nums[first]
            elif nums[first-1] != nums[first+1]:
                first +=1
