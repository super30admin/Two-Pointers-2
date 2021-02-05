# O(N) TIME AND O(1) SPACE WHERE N IS LEN(NUMS)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        left = 1
        right = 1
        count = 1
        while left < len(nums) and right < len(nums):
            if nums[right] == nums[right - 1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[left] = nums[right]
                left += 1
            right += 1
        return left
            
                
        