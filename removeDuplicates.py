"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode :  yes
Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
"""


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 0 or nums == None:
            return 0
        n = len(nums)
        slow = 0
        count = 0
        num_duplicates = 2  # if we want to change the number of duplicates allowed we just change this number
        for i in range(n):
            if i == 0 or nums[i] != nums[i - 1]:
                count = 1
            else:
                count += 1
            if count <= num_duplicates:
                nums[slow] = nums[i]
                slow += 1
        return slow
