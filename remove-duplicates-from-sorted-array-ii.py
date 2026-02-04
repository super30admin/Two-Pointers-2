''' 
Time Complexity : O(n) 
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this :  No
'''
class Solution:
    def removeDuplicates(self, nums):
        n = len(nums)
        slow = 1
        count = 1
        for i in range(1, n):
            if nums[i] == nums[i - 1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[slow] = nums[i]
                slow += 1
        return slow
        