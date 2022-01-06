"""

// Time Complexity : ON
// Space Complexity :O1
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english


"""
class Solution(object):
    def removeDuplicates(self, nums):
        i = 0
        for n in nums:
            if i < 2 or n > nums[i-2]:
                nums[i] = n
                i += 1
        return i