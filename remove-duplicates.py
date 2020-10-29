# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
# Use two pointer approach, 
# one pointer iterates over the array and the other pointer keeps track of duplicates
# // Your code here along with comments explaining your approach
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i = 1 
        for j in range(2,len(nums)):
            if (nums[i] != nums[j]) or (nums[i-1] != nums[j]): # Check for atmost 2 duplicates, compare element with previous and one before previous
                i += 1
            nums[i] = nums[j]
            
        return i+1