# Tc : O(n)
# sc : O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 1
        
        j = 1
        counter = 1
        while j <len(nums):
            if nums[j] == nums [j-1]:
                counter = counter + 1
            else:
                counter = 1
            
            if counter <= 2:
                nums[i] = nums[j]
                i += 1
            j += 1
        return i     
            
        
                