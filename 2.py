'''
Problem2 (https://leetcode.com/problems/merge-sorted-array/)
'''

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None: # type: ignore
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m - 1
        p2 = n - 1
        p = len(nums1) - 1

        while p >= 0:
            if p1 >= 0 and (p2 < 0 or nums2[p2] <= nums1[p1]):
                nums1[p] = nums1[p1]
                p1 -= 1
            else:
                nums1[p] = nums2[p2]
                p2 -= 1
            p -= 1 

                
                   

        