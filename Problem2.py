# Problem 2 - Merge Sorted Array
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
'''
For this problem, we'll use pointers that point to the last, or maximum, element of two arrays, and then compare them. Will save 
the maximum value between two at the last place of the num1 array, and will repeat until both pointers are valid. By starting from 
the last position, we will maintain the order and not lose any numbers because we are doing this in place. 
'''

# Your code here along with comments explaining your approach
from typing import List

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # pointer1 for nums1 array and it will point to maximum value
        pointer1 = m - 1
        # pointer2 for nums2 array and it will point to maximum value
        pointer2 = n - 1
        # index variable for storing the value at the index position
        index = m + n - 1
        # Loop until both pointers are greater than zero
        while (pointer1 >= 0 and pointer2 >= 0):
            # if the element of num1 is greater than element in nums2 then store that value at index position in nums1 and decrement pointer1 
            if nums1[pointer1] > nums2[pointer2]:
                nums1[index] = nums1[pointer1]
                pointer1 -= 1
            # else store value of nums2 at index position in nums1 and decrement pointer2
            else:
                nums1[index] = nums2[pointer2]
                pointer2 -= 1
            # everytime index should be decremented
            index -= 1
        # If pointer1 goes out of bounds and pointer2 is still greater than zero then simple copy the elements of nums2 to num1 from pointer2 to zero
        while (pointer2 >= 0):
            nums1[index] = nums2[pointer2]
            pointer2 -= 1
            index -= 1