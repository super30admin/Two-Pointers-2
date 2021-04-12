# -*- coding: utf-8 -*-
"""
Created on Mon Apr 12 12:03:38 2021

@author: jgdch
"""

#Time complexity: O(N), where N is the length of the input
#Space Complexity:O(1)
#passed all lc testcases
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        slow=1
        fast=1
        count=1
        while(fast<len(nums)):
            if(nums[fast]==nums[fast-1]):
                count+=1
            else:
                count=1
            if(count<=2):
                nums[slow]=nums[fast]
                slow+=1
            fast+=1
        return slow
        