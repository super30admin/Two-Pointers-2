#TimeComplexity:O(M+N) 
#SpaceComplexity: Constant space no extra space taken
#Did this code successfully run on Leetcode : Yes 
#Any problem you faced while coding this : No
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        #Compare the last elements the larger one goes to last index.
        last=m+n-1
        m=m-1
        n=n-1
        while (n>=0 and m>=0):
            if(nums1[m]<nums2[n]):
                nums1[last]=nums2[n]
                n-=1
            else:
                nums1[last]=nums1[m]
                m-=1
            last-=1
        while n>=0: #if nums2 elements are left push them in order
            nums1[last]=nums2[n]
            n-=1
            last-=1
