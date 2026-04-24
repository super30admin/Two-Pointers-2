# https://leetcode.com/problems/merge-sorted-array/

class Solution:
    def merge(self, nums1, m, nums2, n):
        i, j = m - 1, n - 1
        ptr = m + n - 1
        while i >= 0 and j >= 0:
            if nums1[i] > nums2[j]:
                nums1[ptr] = nums1[i]
                i -= 1
            else:
                nums1[ptr] = nums2[j]
                j -= 1
            ptr -= 1

        while j >= 0:
            nums1[ptr] = nums2[j]
            j -= 1
            ptr -= 1
