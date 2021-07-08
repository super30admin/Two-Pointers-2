# Time Complexity : O(N)
# Space Complexity: O(1)

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) < 3: 
            return len(nums)
        index = 2
        
        for i in range(index, len(nums)):
            if nums[i] != nums[index-2]:
                
                nums[index] = nums[i]
                index+=1
                
                
        return index