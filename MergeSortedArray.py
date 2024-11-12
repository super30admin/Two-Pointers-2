# Approach:
# Use three pointers to merge the arrays in-place from the back to the front, starting with the largest elements.
# Place elements in nums1 starting from the end, choosing the larger of the elements from the end of nums1 and nums2 to fill each position.
# This avoids the need for extra space and ensures all elements are merged in non-decreasing order.

# Time Complexity: O(m + n), where m and n are the lengths of nums1 and nums2
# Space Complexity: O(1), as the merge is done in-place
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No



class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # Start from the last index of both arrays and the end of nums1
        p1, p2, p_merge = m - 1, n - 1, m + n - 1

        # Iterate while there are elements to be compared in both nums1 and nums2
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[p_merge] = nums1[p1]  # Place larger element at the end of nums1
                p1 -= 1  # Move pointer in nums1
            else:
                nums1[p_merge] = nums2[p2]  # Place larger element at the end of nums1
                p2 -= 1  # Move pointer in nums2
            p_merge -= 1  # Move merge pointer

        # If there are remaining elements in nums2, place them in nums1
        while p2 >= 0:
            nums1[p_merge] = nums2[p2]
            p2 -= 1
            p_merge -= 1
