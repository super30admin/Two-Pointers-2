# Two-Pointers-2
## Problem2 (https://leetcode.com/problems/merge-sorted-array/)

#Approach
# SInce the 0s are at the end of the nums1 array, set p1 = m-1, p2 = n-1 and idx = len(nums1)-1. Traverse nums1 from last to first index, if nums1[p1] >= nums2[p2] then nums1[idx] = nums1[p1], decrement p1
# Else, set nums1[idx] = nums2[p2], decrement p2 -=1. If p2 >0, set nums1[idx] = nums2[p2] and decrement p2 and idx till p2 < 0
# At each iteration, check if p1 or p2 < 0. If yes, break 

# Time Complexity: O(m+n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if len(nums2) == 0:
            return

        p1 = m-1
        p2 = n-1
        idx = len(nums1)-1

        for idx in range(len(nums1)-1,-1,-1):
            if p1<0 or p2<0:
                break
            if nums1[p1] >= nums2[p2]:
                nums1[idx] = nums1[p1]
                p1 -= 1
            else:
                nums1[idx] = nums2[p2]
                p2 -=1
        
        while(p2>=0):
            nums1[idx] = nums2[p2]
            p2-=1
            idx -= 1