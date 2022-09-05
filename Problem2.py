
## Problem2 (https://leetcode.com/problems/merge-sorted-array/)

# // Time Complexity : o(n)
# // Space Complexity : o(1)


# Solution1 -> 
class Solution:
    def merge(self, nums1, m: int, nums2,  n) -> None:
        nums1[m:m+n] = nums2[:n]
        nums1.sort()