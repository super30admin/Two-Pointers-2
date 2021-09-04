#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Sep  3 18:52:30 2021

@author: ameeshas11
"""

#Time Complexity : O(m)
#Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        fill = m + n - 1
        p1 = m-1
        p2 = n-1
        
        while p1 != -1 and p2 != -1:
            if nums1[p1]>nums2[p2]:
                nums1[fill] = nums1[p1]
                p1 -= 1
            else:
                nums1[fill] = nums2[p2]
                p2 -= 1
            fill -= 1   
           
        if p1 == -1:
            while p2 != -1:
                nums1[fill] = nums2[p2]
                fill -= 1
                p2 -= 1
