# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        #get end of both arrays
        i = m-1
        j = n-1
        e = m+n-1
        # sort it from the back highest to lowest
        while j >=0 and i >=0:
            if nums1[i] > nums2[j]:
                nums1[e] = nums1[i]
                i-=1
            else:
                nums1[e] = nums2[j]
                j-=1
            e-=1
        #fill the restif in the second array
        while j >=0:
            nums1[e] = nums2[j]
            j-=1
            e-=1