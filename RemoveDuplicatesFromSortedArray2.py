# Time Complexity : O(n)
# Space Complexity : O(1)
from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        i = 1
        count = 1  
        for j in range(1, len(nums)):
            if nums[j] == nums[j-1]:
                count += 1
            else:
                count = 1
                
            if count <= 2:
                nums[i] = nums[j]
                i += 1
        
        return i

s1 = Solution()
nums = [0,0,1,1,1,1,2,3,3]
ans = s1.removeDuplicates(nums)
print("Output : ",ans)