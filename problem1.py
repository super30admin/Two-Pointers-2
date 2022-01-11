"""
// Time Complexity : O( N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

"""

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 1
        j = 1
        ctr = 1
        while j < len(nums):
            if nums[j] == nums[j - 1]:
                ctr += 1
            else:
                ctr = 1

            if ctr <= 2:
                nums[i] = nums[j]
                i += 1
            j += 1
        return i
