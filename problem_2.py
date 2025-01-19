"""
problem 2: merge two sorted arrays
tc: O(m+n)
sc: O(1)
Approach: Maintain three pointers, a, b and write_index. a points to the last element of nums1, b points to the last element of nums2 and write_index points to the last element of nums1. Compare the elements at a and b and place the greater element at write_index. Decrement the pointer of the greater element and write_index. Continue this process until b becomes less than 0.

"""
from typing import List


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        a, b, write_index = m-1, n-1, m + n - 1

        while b >= 0:
            if a >= 0 and nums1[a] > nums2[b]:
                nums1[write_index] = nums1[a]
                a -= 1
            else:
                nums1[write_index] = nums2[b]
                b -= 1

            write_index -= 1