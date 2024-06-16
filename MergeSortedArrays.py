# Time Complexity :
# O(m+n) 


# Space Complexity :  
# O(1) 


# Approach:
# Two pointer approach.



class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        right = n-1
        left = m-1 
        numPtr = m+n-1

        while(right>=0):
            if left>=0 and nums2[right] <= nums1[left]:
                nums1[numPtr] = nums1[left]
                left = left-1
            else:
                nums1[numPtr] = nums2[right]
                right = right -1
                
            numPtr = numPtr-1
        