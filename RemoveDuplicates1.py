#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  5 09:31:02 2019

@author: tanvirkaur
"""

#time complexity = O(n)
#space complexity = O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0
        slow = 0
        fast = 1
        flag = False
        while(fast <= len(nums)-1):
            if nums[slow] == nums[fast]:
                if flag == False:
                    flag = True
                    slow += 1
                    nums[slow] = nums[fast]
                    fast += 1
                else:
                    while(fast <= len(nums)-1 and nums[fast] == nums[fast-1]):
                        fast += 1

            else:
                flag = False
                slow += 1
                nums[slow] = nums[fast]
                fast += 1
                    
        return slow+1