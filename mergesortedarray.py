#https://leetcode.com/problems/merge-sorted-array/
#time-o(m+n)
#space-o(1)
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        p1=m-1
        p2=n-1
        #p=len(nums1)-1
        for p in range(m+n-1,-1,-1):
            if p2<0:
                break
            if p1>=0 and nums1[p1]>nums2[p2]:
                nums1[p]=nums1[p1]
                p1-=1
            else:
                nums1[p]=nums2[p2]
                p2-=1