# // Time Complexity : O(m+n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes

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

        for i in range(m+n-1,-1,-1):
            if p2<0:
                break
            if p1>=0 and nums1[p1]>nums2[p2]:
                nums1[i]=nums1[p1]
                p1-=1
            else:
                nums1[i]=nums2[p2]
                p2-=1 