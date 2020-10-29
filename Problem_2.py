"""
Time Complexity : O(m+n) 
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach:
Here, we do not use any extra space for storing the merged array. We start from (m-1) and (n-1) positions 
and start comparing the numbers. Whichever is higher is replaced with the last position of nums1 array,ie,
position (m+n-1). Subsequently, positions are decremented as we proceed to check and compare the numbers
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
        pos = m+n-1
        pos1 = m-1
        pos2 = n-1
        while pos1 >= 0 and pos2 >= 0:
            if nums1[pos1] > nums2[pos2]:
                nums1[pos] = nums1[pos1]
                pos1 -= 1
            else:
                nums1[pos] = nums2[pos2]
                pos2 -= 1
            pos -= 1
        while pos2 >= 0:
            nums1[pos] = nums2[pos2]
            pos -= 1
            pos2 -= 1
