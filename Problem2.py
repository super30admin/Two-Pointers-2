"""
TC: O(M+N) {we iterate the array once}
SC: O(1) { we donot use any extra space}

Approach:

The problem states explicitely that we cannot use extra space and have to modify the nums1 array, hence we can take use of the extra
spaces at the end of the array, filled with zeros.
We initialize a placer pointer at the end of the nums1 array, and start comparing the end elements of both the arrays
(not the ele > m) with each other and get the bigger element and update that element and store in the placer pointer and
decrement that array pointer and continue to do so.
Eventually we will reach a point where the array is sorted.

The problem ran successfully on Leetcode.
"""
from typing import List

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        placer = m + n - 1
        i = m - 1
        j = n - 1

        while j >= 0:
            if i>= 0 and nums1[i] > nums2[j]:
                nums1[placer] = nums1[i]
                i -= 1
            else:
                nums1[placer] = nums2[j]
                j -= 1
            placer -= 1
        
      
