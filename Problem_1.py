
#
# @lc app=leetcode id=80 lang=python3
#
# [80] Remove Duplicates from Sorted Array II
#

# @lc code=start
'''
Time Complexity - O(n). We iterate the entire array just once
Space Complexity - O(1). No additional variables apart from the result array

This code works on Leetcode
'''
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 0 #set the slow to maintain the the result array
        count = 1 #set count to maintain the count of each element
        for i in range(len(nums)):
            if i==0 or nums[i] != nums[i-1]: #if this is first element or element is not duplicate
                count = 1
            else: #else element is duplicate
                count +=1
            if count<=2: #if count is within the allowed number of duplicates
                nums[slow] = nums[i] #insert the element at slow
                slow+=1  #move slow to the next position on right
        return slow

        
# @lc code=end

