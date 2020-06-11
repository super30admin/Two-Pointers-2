# Time Complexity : O(n+m) [m = number of non-zero element in list one, n = numner of elements in list 2]
# 
# Space Complexity : O(1)
# 
# Did this code successfully run on Leetcode : Yes
# 
# Any problem you faced while coding this : No
#
# Problem Approach
# 1. Start at the maximum value in each array with two pointers. We will fill the nums1 array from the end by placing the greater value among the two arrays first
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        while m > 0 and n > 0:
            if nums1[m-1] < nums2[n-1]:
                nums1[m+n-1] = nums2[n-1]
                n -=1
            else:
                nums1[m+n-1] = nums1[m-1]
                m-=1        
        while n>0:
            nums1[n-1] = nums2[n-1]
            n -=1