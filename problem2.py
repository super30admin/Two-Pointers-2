# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :


# Your code here along with comments explaining your approach

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        for i in range(n):
            nums1[m+i] = nums2[i]
        
        i = 0
        j = m
        
        while j < m+n and i < m+n:
            if nums1[i] > nums1[j]:
                nums1[i], nums1[j] = nums1[j], nums1[i]
                j += 1
            
            i += 1
            # print(i, j)