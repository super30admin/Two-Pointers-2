# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i = m-1
        j = n-1
        k = m+n-1
        
        while(j>=0):
            if(i<0 or nums2[j]>=nums1[i]):
                nums1[k]=nums2[j]
                j-=1
            else:
                nums1[k]=nums1[i]
                i-=1
            k-=1