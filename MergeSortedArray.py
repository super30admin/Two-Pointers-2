# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach : Keep 2 pointers at end of each array and an index pointer.
# Compare the elements and insert the larger element at the index.

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        ptr1, ptr2, idx = m-1, n-1, len(nums1) - 1

        while ptr1 >= 0 and ptr2 >= 0:
            if nums1[ptr1] > nums2[ptr2]:
                nums1[idx] = nums1[ptr1]
                idx -= 1
                ptr1 -= 1
            else:
                nums1[idx] = nums2[ptr2]
                idx -= 1
                ptr2 -= 1

        while ptr2 >= 0:
            nums1[idx] = nums2[ptr2]
            idx -= 1
            ptr2 -= 1
        