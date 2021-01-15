#Time Complexity :O(n+m)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode :yes
#Any problem you faced while coding this : tried running sum.
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        l=m-1
        h=n-1
        
        for i in range(m+n-1,-1,-1):
            if(h<0):
                break
            if(l>=0 and nums1[l]>nums2[h]):
                nums1[i]=nums1[l]
                l-=1
            else:
                nums1[i]=nums2[h]
                h-=1
        
                
            
        