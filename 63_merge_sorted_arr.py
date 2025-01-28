# Time complexity - O(m + n)
# Space complexity - O(1)

# Approach - Maintain three pointers - one at end of first list (p1), other at end of second list (p2)
# & third at end of sum of two lists (p3), keep updating the value at nums1[p3] depending on compared vals

from typing import List
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        p1 = m - 1
        p2 = n - 1
        p3 = m + n - 1

        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[p3] = nums1[p1]
                p1 -= 1
                
            # elif nums2[p2] >= nums1[p3]:
            else:
                nums1[p3] = nums2[p2]
                p2 -= 1
                
            p3 -= 1
        
        while p2 >= 0:
            nums1[p3] = nums2[p2]
            p2 -= 1
            p3 -= 1