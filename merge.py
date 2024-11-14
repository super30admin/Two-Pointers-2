# The code defines a merge method to merge two sorted arrays, nums1 and nums2, where nums1 has enough space to accommodate both arrays.
# The method modifies nums1 in place to contain the merged sorted elements.

# Initial Setup:
#   - 'idx' is set to the last index of nums1 (m + n - 1), where m is the initial number of elements in nums1 and n is the length of nums2.
#   - The goal is to merge nums2 into nums1 from the end to avoid overwriting any elements in nums1 that haven't been merged yet.

# Main Merging Loop:
#   - While both m > 0 and n > 0:
#       - Compare the last elements of the active parts of nums1 and nums2 (nums1[m - 1] and nums2[n - 1]).
#       - Place the larger of the two elements at the current position 'idx' in nums1:
#           - If nums1[m - 1] is greater than or equal to nums2[n - 1], set nums1[idx] to nums1[m - 1] and decrement m.
#           - Otherwise, set nums1[idx] to nums2[n - 1] and decrement n.
#       - Decrement idx to move to the next position in nums1.

# Remaining Elements:
#   - If any elements remain in nums2 (i.e., n > 0), place them in the remaining positions in nums1:
#       - Continue setting nums1[idx] to nums2[n - 1], decrementing both n and idx until all elements of nums2 are merged.

# Final Result:
#   - After merging, nums1 contains all elements from both arrays in sorted order.

# TC: O(m + n) - Each element in both nums1 and nums2 is processed once.
# SC: O(1) - The space complexity is constant as the merging is done in place.


from typing import List


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        idx = m + n - 1
        while m > 0 and n > 0:
            if nums1[m - 1] < nums2[n - 1]:
                nums1[idx] = nums2[n - 1]
                n -= 1
            else:
                nums1[idx] = nums1[m - 1]
                m -= 1
            idx -= 1
        while n > 0:
            nums1[idx] = nums2[n - 1]
            n -= 1
            idx -= 1