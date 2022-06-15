"""
TC : O(n) 
SC : O(1)
"""

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 1
        count =1
        for idx in range(1,len(nums)) :
            if nums[idx] == nums[idx-1] :
                count += 1
            else:
                count = 1
            
            if count < 3:
                nums[i] = nums[idx]
                i  += 1
        
        return i
        
        
