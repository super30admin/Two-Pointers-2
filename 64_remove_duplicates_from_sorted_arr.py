# Time complexity - O(n)
# Space complexity - O(1)

# Approach - The array needs to be modified in-place, so we maintain slow pointer along with our current 
# pointer which is increased only when count of numbers is atmost 2, otherwise keep moving current pointer.

from typing import List
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow, i = 1, 1
        count = 1

        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            
            if count <= 2:
                nums[slow] = nums[i]
                slow += 1
        
        return slow