    # 88. Merge Sorted Array
    # Time Complexity : O(n)
    # Space Complexity : O(1)
    # Did this code successfully run on Leetcode : Yes
    # Any problem you faced while coding this : No

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        a1 = m-1
        a2 = n-1
        for i in range(m+n-1, -1, -1):
            if a2 < 0:
                break
            if a1>=0 and nums1[a1]>nums2[a2]:
                nums1[i] = nums1[a1]
                a1 -= 1
            else:
                nums1[i] = nums2[a2]
                a2 -= 1
                