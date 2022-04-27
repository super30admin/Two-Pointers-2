# // Time Complexity : O(m + n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        lastptr = m + n - 1
        r1 = m - 1
        r2 = n - 1

        while r1 >= 0 and r2 >= 0:
            if nums1[r1] >= nums2[r2]:
                nums1[lastptr] = nums1[r1]
                r1 = r1 - 1
            else:
                nums1[lastptr] = nums2[r2]
                r2 = r2 - 1
            lastptr = lastptr - 1

        while r2 >= 0:
            nums1[lastptr] = nums2[r2]
            r2 -= 1
            lastptr -= 1
