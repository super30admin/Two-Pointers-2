## Problem2 (https://leetcode.com/problems/merge-sorted-array/)
# TC : O(m+n)
# SC : O(m) 
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if m ==0:
            nums1[::] = nums2[::]
        if n == 0:
            return
        p1 = p2 = 0
        nums1_copy = nums1[0:m]
        # print(nums1_copy)
        for i in range(len(nums1)):
            if p2>=n or (p1 < m and nums1_copy[p1] <= nums2[p2]):
                nums1[i] = nums1_copy[p1] 
                p1 += 1
            else:
                nums1[i] = nums2[p2]
                p2 += 1
                
        
        