#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Feb 22 14:07:39 2026

@author: rishigoswamy

    LeetCode 80: Remove Duplicates from Sorted Array II
    Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

    Approach:
    Two Pointers + Count Tracking.

    Since the array is sorted, duplicates are consecutive.

    Maintain:
        slow → position to write next valid element
        fast → scans the array
        count → number of times current value has appeared

    Allow each number to appear at most k = 2 times.

    If nums[fast] == nums[fast - 1]:
        increment count
        write only if count <= k
    Else:
        reset count to 1 and write the new number.

    // Time Complexity : O(n)
        Each element is processed once.
    // Space Complexity : O(1)
        In-place modification.
"""

from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k = 2
        count = 1
        slow = 1
        fast = 1
        while fast < len(nums):
            if nums[fast] == nums[fast-1]:
                count +=1
                if count <= k:
                    nums[slow] = nums[fast]
                    slow += 1

            else:
                nums[slow] = nums[fast]
                count = 1
                slow+=1
            fast+=1
        return slow



