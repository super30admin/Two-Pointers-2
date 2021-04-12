# -*- coding: utf-8 -*-
"""
Created on Mon Apr 12 12:04:04 2021

@author: jgdch
"""

#Time complexity: O(m+n)
#Space compleixty: O(1)
#All leetcode testcases passed
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        a=m+n-1
        p1=m-1
        p2=n-1
        while(p1>=0 and p2>=0):
            if(nums1[p1]>=nums2[p2]):
                nums1[a]=nums1[p1]
                p1-=1
            else:
                nums1[a]=nums2[p2]
                p2-=1
            a-=1
        while(p2>=0):
            nums1[a]=nums2[p2]
            p2-=1
            a-=1
        return nums1