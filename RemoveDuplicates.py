"""
//Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this : NO
"""
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i = 1
        j = 1
        count = 1
        while(i<len(nums)):
            if(nums[i]==nums[i-1]):
                count+=1
            else:
                count=1
            if(count<=2):
                nums[j]=nums[i]
                j+=1
            i+=1
        return j