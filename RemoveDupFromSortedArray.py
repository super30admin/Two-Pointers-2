"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Three line explanation of solution in plain english
"""
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # Initialize a pointer and count varibales
        count = 1
        loc = 1
        if len(nums) == 0:
            return 0
        # Loop through the array and increment count when current element and
        # the previous are same. If not reinitialize count back to 1. Also swap
        # elements when count is < or equa two
        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[loc] = nums[i]
                loc += 1
        return loc