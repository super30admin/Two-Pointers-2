"""
//Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this : NO
"""


class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        # for i in range(0,len(nums1)):
        #     if(nums1[i]==0):
        #         nums1.pop(i)
        # nums1[:]=nums1[:m]+nums2[:n]
        # nums1.sort()
        i,j,k = m-1,n-1,m+n-1
        while(i>=0 and j>=0):
            if(nums1[i]>nums2[j]):
                nums1[k]=nums1[i]
                i-=1
                k-=1
            else:
                nums1[k]=nums2[j]
                j-=1
                k-=1
        while(j>=0):
            nums1[k]=nums2[j]
            k-=1
            j-=1
        
        
        
        
                