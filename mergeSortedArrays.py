"""
Problem: Merge Sorted Array
----------------------------
You are given two sorted integer arrays nums1 and nums2, and two integers m and n.
Merge nums2 into nums1 as one sorted array in-place.

Approach (One-liner):
Use three pointers starting from the end of both arrays to fill nums1 from the back.

Time Complexity: O(m + n)
Space Complexity: O(1) — in-place merge without using extra space
"""

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        # Start filling from the last position of nums1 (where the largest element should go)
        write_index = m + n - 1

        # Last valid elements in nums1 and nums2
        i = m - 1  # pointer for nums1
        j = n - 1  # pointer for nums2

        # Merge nums1 and nums2 from the back
        while i >= 0 and j >= 0:
            # Compare the last unmerged elements in nums1 and nums2
            # Place the larger one at the current write_index position
            if nums1[i] > nums2[j]:
                nums1[write_index] = nums1[i]
                i -= 1
            else:
                nums1[write_index] = nums2[j]
                j -= 1
            write_index -= 1

        # If any elements remain in nums2, copy them into nums1
        # (If nums1 still has remaining elements, they’re already in place)
        while j >= 0:
            nums1[write_index] = nums2[j]
            j -= 1
            write_index -= 1
