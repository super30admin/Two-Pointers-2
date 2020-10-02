# // Time Complexity : O(M+N)Log(M+N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english
"""
Take first m elements from nums1, first n elements from nums2 and combine them then sort them.
Brute Force
"""
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        nums1[m:] = nums2
        nums1[:] = sorted(nums1)
            