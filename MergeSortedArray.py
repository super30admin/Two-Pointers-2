# Time Complexity - O(m*n)

# Space Complexity - O(1)

# Did this code successfully run on Leetcode : No

# Any problem you faced while coding this : No

# Approach
# I use a three pointer approach where two pointers are used for comparing and the third pointer is used for assignment.

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if nums1 == None or len(nums1) == 0:
            return None

        p1, p2, i = m - 1, n - 1, m + n - 1

        while (p1 >= 0 and p2 >= 0):

            if nums1[p1] < nums2[p2]:
                nums1[i] = nums2[p2]
                p2 -= 1

            else:
                nums1[i] = nums1[p1]
                p1 -= 1

            i -= 1

        while (p2 >= 0):
            nums1[i] = nums2[p2]
            p2 -= 1
            i -= 1

