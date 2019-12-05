#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  5 09:18:52 2019

@author: tanvirkaur
"""

# Space complexity = O(1)
# Time complexity = O(n+m)

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        ptr1 = m-1
        ptr2 = n-1
        ptr = m+n-1
        while(ptr1 >= 0 and ptr2 >= 0):
            if nums1[ptr1] > nums2[ptr2]:
                nums1[ptr] = nums1[ptr1]
                ptr1 -= 1
            else:
                nums1[ptr] = nums2[ptr2]
                ptr2 -= 1
            ptr -= 1
                
                
        while (ptr2 >=0):
            nums1[ptr] = nums2[ptr2]
            ptr -=1
            ptr2 -= 1
            
        return nums1
            