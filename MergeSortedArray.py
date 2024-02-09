'''
TC: O(m+n)
SC: O(1)
'''
from typing import List

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i, j, k = m-1, n-1, len(nums1)-1
        while i>=0 and j>=0:
            if nums1[i]<=nums2[j]:
                nums1[k] = nums2[j]
                j -= 1
                k-= 1
            else:
                nums1[k] = nums1[i]
                i -= 1
                k -= 1
        while k>=0 and j>=0:
            nums1[k] = nums2[j]
            j -= 1
            k-= 1
        print(nums1)
s = Solution()
s.merge([1,2,3,0,0,0], 3, [2,5,6], 3)
s.merge([1], 1, [], 0)
s.merge([0], 0, [1], 1)
s.merge([2,0], 1, [1], 1)
s.merge([0,0,0,0,0], 0, [1,2,3,4,5], 5)