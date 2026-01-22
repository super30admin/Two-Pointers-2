# Time Complexity : O(m + n) where m and n are lengths of nums1 and nums2
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Use two pointers starting from the end of both arrays, comparing and placing larger elements at the end of nums1.
# Start from the last valid positions (m-1 for nums1, n-1 for nums2) and work backwards.
# This avoids overwriting unprocessed elements in nums1 since we're filling from the end.

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # Pointers for nums1, nums2, and the end of merged array
        i = m - 1
        j = n - 1
        k = m + n - 1
        
        # Merge from the end
        while i >= 0 and j >= 0:
            if nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                i -= 1
            else:
                nums1[k] = nums2[j]
                j -= 1
            k -= 1
        
        # Copy remaining elements from nums2 if any
        while j >= 0:
            nums1[k] = nums2[j]
            j -= 1
            k -= 1
