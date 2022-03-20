# Time Complexity: O(m+n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : YES
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        i = m-1
        j = n-1
        k = n+m-1
        while k >= 0 and j>=0 and i>=0:
            if nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                i-=1
            else:
                nums1[k] = nums2[j]
                j-=1
            k-=1
            
        while j>=0 and k>=0:
            nums1[k] = nums2[j]
            j-=1
            k-=1
                