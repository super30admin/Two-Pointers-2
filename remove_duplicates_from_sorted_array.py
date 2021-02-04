'''
Time complexity: O(n)
Space complexity: O(1)
'''
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0:
            return 0
        j = 1
        count = 1
        
        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count = count + 1
            else:
                count = 1
            
            if count <= 2:
                nums[j] = nums[i] # since we don't require to store duplicate elements > 2 count
                j = j + 1
        return j