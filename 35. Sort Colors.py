# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums) == 0 and nums is None: return
        if len(nums) == 1: return nums
        low, mid = 0, 0
        high = len(nums) - 1
        while(mid <= high):
            if nums[mid] == 2:
                temp = nums[mid]
                nums[mid] = nums[high]
                nums[high] = temp
                high -= 1
            
            elif nums[mid] == 0:
                temp = nums[mid]
                nums[mid] = nums[low]
                nums[low] = temp
                low += 1
                mid += 1
            
            else:
                mid += 1
        
        return nums