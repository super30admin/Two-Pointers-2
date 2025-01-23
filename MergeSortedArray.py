# Time Complexity : O(m +n)
# Space Complexity: O(1)
from typing import List


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
       c = m + n -1
       a = m - 1
       b = n -1

       if len(nums1) ==1 and m == 0:
        nums1[0] = nums2[0]


       
       while a >= 0 and b >= 0:
        if nums1[a] < nums2[b]:
            nums1[c] = nums2[b]
            b = b - 1
        else:
            nums1[c] = nums1[a]
            a = a - 1
        c = c -1

       while b >= 0:
        nums1[c] = nums2[b]
        c = c-1
        b = b-1
        