# Time complexity: O(m + n) where m + n is the length of the first array (Total number of elements).
# Space complexity: O(1).
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # Two pointer approach.
        r1 = m - 1
        r2 = n - 1
        r3 = m + n - 1
        while r1 >= 0 and r2 >= 0:          
            if nums1[r1] > nums2[r2]:
                nums1[r3] = nums1[r1]   # Move elements of nums1 to the end.
                r3 -= 1
                r1 -= 1
            else:
                nums1[r3] = nums2[r2]   # Move elements of nums2 to end of nums1.
                r3 -= 1
                r2 -= 1
        while r2>= 0:                   # For any remaining elements in nums2 array.
            nums1[r3] = nums2[r2]
            r3 -= 1
            r2 -= 1
        