"""
Name: Srinidhi 
Time Complexity: O(n) - Going through the array once
Space Complexity: O(1) - No extra Space

Did it run on Leetcode: Yes

Logic: Maintain one pointer for each array. At every iteration keep comparing the 
Values of elements in each of the array. 
Compare their values and shift the pointers
"""

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if m == 0:
            nums1[:] = nums2
            return nums1 
        
        pointer1 = m-1
        pointer2 = n-1
        
        total = m+n-1
        
        while pointer1>=0 and pointer2>=0:
            if nums1[pointer1] < nums2[pointer2]:
                nums1[total] = nums2[pointer2]
                pointer2 = pointer2 - 1
            
            else:
                nums1[total] = nums1[pointer1]
                pointer1 = pointer1 - 1
            
            total = total - 1
        