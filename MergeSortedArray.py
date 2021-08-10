"""
Time Complexity : O(m + n) m and n are length of nums1 and nums2 respectively
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
"""
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i = m - 1
        j = n - 1
        k = m + n - 1
        # We swap the elements that are greater starting from the last
        while i >= 0 and j >= 0:
            # If num is greater than we swap
            if nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                k -= 1
                i -= 1
            # If num is smaller than we swap
            else:
                nums1[k] = nums2[j]
                k -= 1
                j -= 1
        # Copying over the remaining elements
        while j >= 0:
            nums1[k] = nums2[j]
            k -= 1
            j -= 1