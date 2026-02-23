# Time Complexity : O(m + n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach: Use three pointers starting from the ends of nums1 valid part and nums2, filling nums1 from the back.
# Place the larger element at the current index and move pointers backward, if nums2 remains, copy its elements into nums1.


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i,j = m - 1,n - 1
        idx = m + n - 1
        while i >= 0 and j >= 0:
            if nums1[i] > nums2[j]:
                nums1[idx] = nums1[i]
                i -= 1
            else:
                nums1[idx] = nums2[j]
                j -= 1
            idx -= 1
        
        while j >= 0:
            nums1[idx] = nums2[j]
            idx -= 1
            j -= 1



