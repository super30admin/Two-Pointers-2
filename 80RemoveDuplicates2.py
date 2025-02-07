from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) <= 2:
            return len(nums)  
        
        slow = 2  
        # Slow pointer: Where the next valid number should go
        # Fast pointer: Iterates over the array
        for fast in range(2, len(nums)):
            if nums[fast] != nums[slow - 2]: 
                nums[slow] = nums[fast] 
                slow += 1 
        
        return slow 
