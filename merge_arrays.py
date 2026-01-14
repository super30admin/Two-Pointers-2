"""
time - o(n)
space - o(1)
set p and q to m-1 and n-1, these are pointers that point to the biggest elements in both the lists. whichever is the biggest among the two copy them to the last position in nums1. Then decrement the corresponding pointer.
the last position of the array nums1 is tracked by the pointer r = m+n-1
"""

from typing import List


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # edge case if m=0 or n=0
        if m == 0:
            nums1[0] = nums2[0]
        p = m - 1
        q = n - 1
        r = m + n - 1
        while r >= 0:
            if p >= 0 and q >= 0:
                if nums1[p] > nums2[q]:
                    nums1[r] = nums1[p]
                    p -= 1
                else:
                    nums1[r] = nums2[q]
                    q -= 1
                r -= 1
            elif p >= 0:
                nums1[r] = nums1[p]
                r -= 1
                p -= 1
            elif q >= 0:
                nums1[r] = nums2[q]
                q -= 1
                r -= 1
