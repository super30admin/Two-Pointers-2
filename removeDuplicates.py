"""
Intuition: Use one pointer to collect all the numbers and another pointer to set the position of the new number
#####################################################################
Time Complexity : O(N) where N = total number of elements
Space Complexity : O(1) 
#####################################################################
"""

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i, j = 1, 1
        count = 1
        
        for i in range(1, len(nums)):
            
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count= 1
            if count <= 2:
                nums[j] = nums[i]
                j +=1
            
            
            
        return j