# // Time Complexity : O(m+n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
# Use two pointer approach -  this is like the merge phase of mergesort
# each pointer is used to iterate over either array from last element to first and compare elements
# Write larger of the two elements to the end of the array with extra space
# // Your code here along with comments explaining your approach
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        # initialize two pointers at end of arrays, use end to keep track of empty spaces to write elements
        i, j = m-1, n-1
        end = len(nums1) - 1 
        
        if m == 0:
            nums1[:] = nums2[:]
        
        while i >= 0 and j >= 0: 
            if nums1[i] > nums2[j]:
                nums1[end] = nums1[i]
                i -= 1
                end -= 1
            elif nums1[i] <= nums2[j]:
                nums1[end] = nums2[j]
                j -= 1
                end -= 1
        # Process left over elements
        while i >= 0 and end >= 0:
            nums1[end] = nums1[i]
            i -= 1
            end -= 1
            
        while j >= 0 and end >= 0:
            nums1[end] = nums2[j]
            end -= 1
            j -= 1
        