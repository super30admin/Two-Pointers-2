# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# We have a pointer to the end of both arrays
# We start from the end and compare elements from both arrays
# We run this loop for the  m+n elements
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m - 1
        p2 = n - 1
        k = m + n -1

        while k >= 0 and p2 >= 0:
            if p1 >= 0 and nums1[p1] > nums2[p2]:
                nums1[k] = nums1[p1]
                p1 -= 1
            else:
                nums1[k] = nums2[p2]
                p2 -= 1
            k -= 1
