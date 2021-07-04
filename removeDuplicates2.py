"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : none
"""

class Solution:
    def removeDuplicates(self, nums):
        len_n = len(nums)
        if nums == None or len_n == 0:
            return 0
        
        slow = 0
        fast = 1
        flag = False
        
        while fast < len_n:
            if nums[slow] == nums[fast] and flag == False:
                flag = True
                slow += 1
                nums[slow] = nums[fast]
                fast += 1
            elif nums[slow] == nums[fast] and flag == True:
                fast += 1
            else:
                flag = False
                slow += 1
                nums[slow] = nums[fast]
                fast += 1
                
        return slow + 1

s = Solution()
print(s.removeDuplicates([0,0,1,1,1,1,2,3,3]))