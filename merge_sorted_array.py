""" Explanation: We start by having two pointers, each pointing at the last index of nums1 and nums2 respectively. Then another pointer is
    at the last index of the array if those two were merged. Then we iterate using the pointers to see which element was bigger between 
    the two arrays and then insert the one at the array. 
    Time Complexcity: O(m+n)
    Space Complexcity: O(1)
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
        arr1_pointer = m - 1
        arr2_pointer = n - 1
        mid = m + n - 1
        
        while arr2_pointer >= 0:
            if arr1_pointer >= 0 and nums1[arr1_pointer] > nums2[arr2_pointer]:
                nums1[mid] = nums1[arr1_pointer]
                arr1_pointer -= 1
            else:
                nums1[mid] = nums2[arr2_pointer]
                arr2_pointer -= 1
            mid -= 1