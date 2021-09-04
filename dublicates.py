#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Sep  3 18:52:29 2021

@author: ameeshas11
"""

#Time Complexity : O(n)
#Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        p1 = 1
        p2 = 1
        count = 1
        k = 2
        
        while p2 < len(nums):
            if nums[p1-1] == nums[p2]:
                count += 1
            else:
                nums[p1], nums[p2] = nums[p2], nums[p1]
                count = 1
                
            if count > k:
                p2 += 1
            else:
                if count > 1:
                    nums[p1] = nums[p1-1]
                p1 += 1
                p2 += 1
               
        return p1 
        