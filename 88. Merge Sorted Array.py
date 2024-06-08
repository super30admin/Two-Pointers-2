# Submitted by : Aryan Singh_RN12MAY2023
# Time Complexity : O(max(m,n))
# Space Complexity : Average : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        - Go backwards in nums1 array, comparing the largest value between two arrays
        - if nums2 is exhausted nums1 pending arrays will remain sorted in order
        - if num1 is exhausted first, nums2 will be ordered one after another 
        """
        p1 = m - 1
        p2 = n - 1
        p = len(nums1)
        while p > 0:
            p -= 1
            if (p2 < 0):
                break
            elif (p1 < 0):
                nums1[p] = nums2[p2]
                p2 -= 1
            elif (nums1[p1] >= nums2[p2]):
                nums1[p] = nums1[p1]
                p1 -= 1
            elif (nums2[p2] > nums1[p1]):
                nums1[p] = nums2[p2]
                p2 -= 1
        