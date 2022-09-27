
        # O(N) time and O(1) space. 
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
       
        count = 1
        k = 1
        
        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                count += 1
            else:
                count = 1 # reset
            
            if count <= 2:
                nums[k] = nums[i]
                k += 1
        
        return k