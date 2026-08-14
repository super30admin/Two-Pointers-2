# https://leetcode.com/problems/merge-sorted-array/description/

# TC: O(n + m)
# SP: O(1)
# Explanation: Place two points at the end of each nums array, and another pointer at the nums1;
# keep comparing nums1 vs nums2 and insert the higher value, and in the end you will get the fully sorted array in nums1

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m - 1
        p2 = n - 1
        for p in range(n + m - 1, -1, -1):
            if p2 < 0:
                break
            if p1 >= 0 and nums1[p1] > nums2[p2]:
                nums1[p] = nums1[p1]
                p1 -= 1
            else:
                nums1[p] = nums2[p2]
                p2 -= 1
