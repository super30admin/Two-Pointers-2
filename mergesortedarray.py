"""
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, 
but instead be stored inside the array nums1. To accommodate this, 
nums1 has a length of m + n, where the first m elements denote the elements that should be merged, 
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

"""

# Time Complexity : O(m+n) m = non zero elements in intial nums1 n = elements in nums2
# Space Complexity : O(m) 
# Did this code successfully run on leetCode : Yes
# Any problem you faced while coding this :  No

from typing import List

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        # boundaries for arrays
        i = m-1
        j = n-1
        k = len(nums1) - 1
        
        # while array elements present
        while i >= 0 and j >= 0:
            
            # if current element in each array is less than the other, add to nums1
            # adjust pointers accordingly
            if nums1[i] < nums2[j]:
                nums1[k] = nums2[j]
                j -= 1
                k -= 1
            
            # if current element is greater thenn add to nums1 to be compared again
            # adjust pointers accordingly
            else:
                nums1[k] = nums1[i]
                i -= 1
                k -= 1
                
        # in the end if there are few elements left in an array, merge and add again 
        # adjust pointers accordingly
        while j >= 0:
            nums1[k] = nums2[j]
            j -= 1
            k -= 1


        """
        low = 0
        high = 0
        i = 0
        #len(nums1) = m + n 
        #len(nums2) = n
        
        numsHalf = nums1[:m]
        
        
        for i in range(m + n):
            
            if high >= n or (low < m and numsHalf[low] <= nums2[high]):
                nums1[i] = numsHalf[low]
                low += 1
            else:
                nums1[i] = nums2[high]
                high += 1
            
            Another approach but giving wrong answer:

            if nums1[low] < nums2[high] and nums1[low+1] >= nums2[high]:
                nums1.insert(low+1, nums2.pop(nums2.index(nums2[high])))
                low += 3
                high += 1
            
            elif nums1[low] >= nums2[high] and nums1[low+1] >= nums2[high]:
                nums1.insert(low-1, nums2.pop(nums2.index(nums2[high])))
                low += 2
                high += 1

           #return nums1
           """
        