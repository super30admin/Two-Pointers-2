"""
## Problem2 (https://leetcode.com/problems/merge-sorted-array/)
TC: O(N + M)
SC: O(1)
"""

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if nums1 == [] and nums2 == []: return []
        
        ptr1 = m - 1 
        ptr2 = m + n - 1
        ptr3 = n - 1
        
        while (ptr3 >= 0 and ptr1 >= 0):
            if (nums1[ptr1] > nums2[ptr3]):
                nums1[ptr2] = nums1[ptr1]
                ptr1 -= 1
                
            else:
                nums1[ptr2] = nums2[ptr3]
                ptr3 -= 1
                
            ptr2 -= 1
            
        while ptr3 >= 0:
            nums1[ptr2] = nums2[ptr3]
            ptr3 -= 1
            ptr2 -= 1
        