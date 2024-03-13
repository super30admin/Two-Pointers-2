# https://leetcode.com/problems/merge-sorted-array/

# Time Complexity : O(N) where N is number of elements in the array.
# Space Complexity : O(1).
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

# Your code here along with comments explaining your approach.
# Approach - We need two pointers for both the arrays. We need one more pointer to keep track of where to insert the
# value. We start from backwards and compare the value of both the arrays and we insert the large value in the
# array and keep decrementing the insert pointer.

from typing import List


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        first = m - 1
        second = n - 1
        insert = m + n - 1
        while first >= 0 and second >= 0:
            if nums1[first] > nums2[second]:
                nums1[insert] = nums1[first]
                first -= 1
            else:
                nums1[insert] = nums2[second]
                second -= 1
            insert -= 1

        while second >= 0:
            nums1[insert] = nums2[second]
            second -= 1
            insert -= 1