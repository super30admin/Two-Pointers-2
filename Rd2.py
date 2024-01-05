#Time complexity: O(N)
#Space complexity: O(1)


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        count = 1
        k = 2
        sp = 0
        i = 1
        
        while i < len(nums):
            
            if nums[i] == nums[i-1]:
                count = count + 1
                
            else:
                count = 1
                
            if count <= k:
                sp = sp + 1
                nums[sp] = nums[i]
                
            i = i + 1
            
        return sp + 1
        
        
