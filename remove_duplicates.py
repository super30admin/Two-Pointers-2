# Time Complexity - O(n)
# Space Complexity - O(1)

class Solution:
    
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 1
        j = 1
        count = 1
        while j<len(nums) and i<len(nums):
            if nums[j]==nums[j-1]:
                count=count+1
            else:
                count=1
            if count<=2:
                nums[i] = nums[j]
                i = i+1
            j = j+1
        return i
