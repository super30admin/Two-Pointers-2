"""
Time Complexity : O(n) 
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach:
We are using a two pinter approach here. This code is scalable with any number of duplicates, be it 2,3 or more.
We keep a counter that counts the number of duplicates and a pointer j that basically maintains the 
position where the element will be replaced. The i pointer just iterates through the loop and we swap any new 
number found with the position of j
"""


class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
        i, j = 1, 1
        n = len(nums)-1
        count = 1
        while i <= n:
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[j] = nums[i]
                j += 1
            i += 1
        return j
