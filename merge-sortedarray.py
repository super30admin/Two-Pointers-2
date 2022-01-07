# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

from typing import List


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        # setting two pointer at the end of the array 1 and 2
        p1 = m - 1
        p2 = n - 1

        # p is basically pointing to the last value of the nums1 array which is 0 and will be moving in backwards
        for p in range(n + m - 1, -1, -1):

            if p2 < 0:
                break

            # check if the p1 value is less than p2 then replace p with p1 value
            if p1 >= 0 and nums1[p1] > nums2[p2]:
                nums1[p] = nums1[p1]
                # decrement pointer p1
                p1 = p1 - 1

            else:
                nums1[p] = nums2[p2]  # replace p with p2 value
                # decrement pointer p2
                p2 = p2 - 1
