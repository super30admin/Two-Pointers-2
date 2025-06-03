# Time Complexity -  O(n) 
# Space Complexity -  O(1) 

class Solution:
    def removeDuplicates(self, nums):
        left = 1
        count = 1
        for right in range(1, len(nums)):
            if nums[right - 1] == nums[right]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[left] = nums[right]
                left += 1
        return left
