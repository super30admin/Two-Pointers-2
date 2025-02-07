# Time Complexity : O(n) - n is len nums
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

"""
Start with two pointers slow and fast
Keep track of count of duplicates
Increment slow only when count <= 2

"""

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        slow = 1
        count = 1

        for fast in range(1, len(nums)):
            if nums[fast] == nums[fast - 1]:
                count += 1
            else:
                count = 1

            if count <= 2:
                nums[slow] = nums[fast]
                slow += 1
        return slow