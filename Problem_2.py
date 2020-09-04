
# 88. Merge Sorted Array

# Code:

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        # Since nums2 elements needs to be removed and added into nums1. We consider only 'n' here
        while n:
            # If nums2 val is greater than nums1 val, we add it to the last index.
            if m<=0 or nums2[n-1]>=nums1[m-1]:
                nums1[m+n-1] = nums2[n-1]
                n-=1
            else:
                nums1[m+n-1] = nums1[m-1]
                m-=1


# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES.