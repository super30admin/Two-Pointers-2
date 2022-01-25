"""
Given an integer array nums sorted in non-decreasing order, 
remove some duplicates in-place such that each unique element appears at most twice. 
The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, 
you must instead have the result be placed in the first part of the array nums. 
More formally, if there are k elements after removing the duplicates, then the first k elements of nums 
should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. 
You must do this by modifying the input array in-place with O(1) extra memory.

"""

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on leetCode : Yes
# Any problem you faced while coding this :  No

from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        i = 1
        j = 1
        
        # if counter > 1 then there are duplicates
        # if counter = 1 then there are no dupllicates
        counter = 1
        
        
        while j < len(nums):
            
            # increase counter if duplicates found
            if nums[j] == nums[j-1]:
                 counter += 1
                
            # if not found, keep it set to 1
            else:
                counter = 1
                
            # if there are duplicates, move to next pointer after updating elements
            if counter <= 2:
                
                nums[i] = nums[j]
                i+= 1
            
            j += 1
        
        return i