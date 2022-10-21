#Time Complexity : O(m+n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        arr = nums1[:]
        i = 0
        j = 0
        l = 0
        while l < (m + n):
            if n == 0 or j >= n:
                nums1[l] = arr[i]
                i += 1
            elif  i < m and arr[i] <= nums2[j]:
                nums1[l] = arr[i]
                i += 1
                
            else :
                nums1[l] = nums2[j]
                j += 1          
            l += 1            