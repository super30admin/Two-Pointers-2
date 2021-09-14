# Time Complexity: O(N)
# Space Complexity: O(1)
# Approach to solve this problem:

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        if len(nums) == 0:                          # Edge case
            return 0
        
        j = 0               # Slow pointer
        
        for i in range(1, len(nums)):               # Check if two nos are differnt
            if nums[i] != nums[j]:                  # Check
                j += 1                              # Increment slow pointer by 1
                nums[j] = nums[i]                   # Put fast pointer value 
        return j + 1
        