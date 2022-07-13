#Time Complexity : O(m+n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """

        ind=0
        
        i= m - 1
        j = n - 1
        k = m + n - 1;

        
        while(k>=0):
            if (j<0 or nums1[i] > nums2[j])and i >= 0:
                tmp=nums1[i]
                nums1[k]=nums1[i]
                i=i-1
            else:
                nums1[k]=nums2[j]
                j-=1
            k-=1
            
                