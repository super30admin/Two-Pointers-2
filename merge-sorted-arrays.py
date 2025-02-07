# Time Complexity : O(max(m,n))
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

"""
Start from the end for both the arrays and keep on putting the bigger element at the end of nums1
"""

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        i = m - 1
        j = n - 1
        index = m + n - 1

        while i >= 0 and j >= 0:
            if nums2[j] >= nums1[i]:
                nums1[index] = nums2[j]
                j = j - 1
                index = index - 1
            else:
                nums1[index] = nums1[i]
                i = i - 1
                index = index - 1

        while index >= 0 and j >= 0:
            nums1[index] = nums2[j]
            j = j - 1
            index = index - 1