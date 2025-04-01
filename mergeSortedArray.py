# Time Complexity: O(m+n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach:
# 1. We start by comparing the last elements in both the arrays.
# 2. We maintain 3 pointers, p1, p2 and idx, to keep track of which elements to compare and where to place the higher element respectively
# 2. We place the higher element in the last index and decrement the pointer that gave us the higher element as well as the idx to point towards the next available space.
from typing import List
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # Initialize p1 and p2 to point to the highest elements in nums1 and nums2 respectively
        p1, p2 = m-1, n-1
        # Initialize idx to point to the place in nums1 that will hold the current highest element between p1 and p2.
        idx = m+n-1

        # Iterate p1 and p2 over nums1 and nums2 until either pointer goes out of bounds
        while p1 >= 0 and p2 >= 0:
            # If element at p1 is greater, we place it at the idx, and decrement p1 to point towards the next element in nums1
            if nums1[p1] > nums2[p2]:
                nums1[idx] = nums1[p1]
                p1 -= 1
            # If element is p1 is smaller, we place the element at p2 at idx, and decrement p2 to point towards the next element in nums2
            elif nums1[p1] <= nums2[p2]:
                nums1[idx] = nums2[p2]
                p2 -= 1
            idx -= 1

        # If there are any elements left in nums2 that didn't get compared, we simply place then in front of nums1
        while p2 >= 0:
            nums1[idx] = nums2[p2]
            p2 -= 1
            idx -= 1