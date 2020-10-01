# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : no
# Any problem you faced while coding this : don't know how to do


class Solution:
    def removeDuplicates(self, nums):
        
        ans = 0
        l = 0
        for r in range(len(nums)):
            if nums[l]!=nums[r]:
                l = r
            else:
                if r-l>=2:
                    ans += 1
        return len(nums)-ans