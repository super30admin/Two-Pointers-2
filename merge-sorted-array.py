# Time Complexity : O(m + n), where m and n are the sizes of the input arrays
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        curr = m + n - 1
        p1 = m - 1
        p2 = n - 1

        # insert largest elements from the end
        while p1 >= 0 and p2 >= 0:

            if nums1[p1] > nums2[p2]:
                nums1[curr] = nums1[p1]
                p1 -= 1

            else:
                nums1[curr] = nums2[p2]
                p2 -= 1

            curr -= 1

        # insert any remaining elements from nums2 into nums1
        while p2 >= 0:
            nums1[curr] = nums2[p2]
            p2 -= 1
            curr -= 1
