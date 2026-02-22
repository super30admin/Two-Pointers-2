#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Feb 22 14:10:28 2026

@author: rishigoswamy

    LeetCode 88: Merge Sorted Array
    Link: https://leetcode.com/problems/merge-sorted-array/

    Approach:
    Three pointers starting from the end.

    nums1 has length m + n, where the last n slots are empty (0 placeholders).
    To merge in-place without overwriting useful values in nums1, we fill nums1
    from the back.

    Pointers:
        ptr1 -> last valid element in nums1 (index m-1)
        ptr2 -> last element in nums2 (index n-1)
        idx  -> last position in nums1 (index m+n-1)

    At each step:
        Place the larger of nums1[ptr1] and nums2[ptr2] into nums1[idx],
        then move pointers accordingly.

    After the main loop, if nums2 still has remaining elements, copy them.

    // Time Complexity : O(m + n)
        Each pointer only moves left across its array once.
    // Space Complexity : O(1)
        In-place merge.
"""

from typing import List

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        ptr1 = m-1
        ptr2 = n-1
        idx = len(nums1)-1
        if m == 0 and n > 0:
            while ptr2 >= 0:
                nums1[idx] = nums2[ptr2]
                ptr2-=1
                idx-=1
        while (ptr1 >= 0 and ptr2 >= 0):
            if nums1[ptr1] > nums2[ptr2]:
                nums1[idx] = nums1[ptr1]
                ptr1-=1
                idx-=1
            else:
                nums1[idx] = nums2[ptr2]
                ptr2-=1
                idx-=1
        
        if ptr1 < 0 and ptr2>=0:
            while ptr2 >= 0:
                nums1[idx] = nums2[ptr2]
                ptr2-=1
                idx-=1

         
        

        

