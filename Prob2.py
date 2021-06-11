#Time complexity: O(m*n)   
#Space complexity: O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        i,j,k = m-1,n-1,len(nums1)-1
        #start from the very end of both lists
        #keep comparing, and add the greater element at the end
        while i>= 0 and j>=0:
            if nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                i -= 1
            else:
                nums1[k] = nums2[j]
                j-=1
            k -= 1
        #if smaller list elements are pending, copy those elements in first list
        #if larger list elements lift, let them be, since already sorted.
        while j>=0:
            nums1[k] = nums2[j]
            j-=1
            k-=1
        
        