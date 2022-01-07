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

# Time Complexity : O(n2)
# Space Complexity : O(1)
# Did this code successfully run on leetCode : Yes
# Any problem you faced while coding this :  No

from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        i = 1
        k = 1

        while i < len(nums):

            if nums[i] == nums[i-1]:
                k += 1

                if k > 2:
                    nums.pop(i) # tried using remove() but it didnt work because Remove() removes first matching element
                    
                    # pop will remove an element so need to decrement to get back to prior position
                    i -= 1 # 
                    
            else:
                k = 1

            i += 1

        # since we are popping elements, len(nums) = number of elements after reomoving duplicates
        return len(nums)