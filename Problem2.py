# Problem2 (https://leetcode.com/problems/merge-sorted-array/)
# Time Complexity: O(m + n),every element from both arrays is visited and placed exactly once
# Space Complexity: O(1), merging is done in-place using nums1's existing slots, no new array created

# We fill nums1 from the back, comparing the last unplaced elements of nums1 and nums2.
# We place the bigger of the two at the current end position and move that pointer backward.
# Once nums1's real elements are exhausted, any leftover elements in nums2 are copied directly.

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1, p2, p3 = m-1, n-1, m+n-1   # p1: last real elem in nums1, p2: last elem in nums2, p3: last slot to fill

        while p1 >= 0 and p2 >= 0:       # keep going while both arrays still have unplaced elements
            if nums2[p2] > nums1[p1]:    # nums2's value is bigger
                nums1[p3] = nums2[p2]    # place it at the current end slot
                p2 -= 1                  # move nums2's pointer back
            else:                         # nums1's value is bigger or equal
                nums1[p3] = nums1[p1]    # place it at the current end slot
                p1 -= 1                  # move nums1's pointer back
            p3 -= 1                      # move to the next slot (one step left)

        while p2 >= 0:                   # if nums2 still has leftover elements (nums1 ran out first)
            nums1[p3] = nums2[p2]        # copy them directly,they're already smaller than everything placed
            p2 -= 1
            p3 -= 1