class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 1
        
        while i < (len(nums)-1):
            if nums[i] == nums[i-1] and nums[i] == nums[i+1]:
                nums.pop(i)
                i -=1
            
            i += 1

# Time complexity is O(n) where n is the lenght of the array
# Space complexity is O(1) 
# Approach used: Iterated over the array in a single pass and removed element which equalled previous and next element
            