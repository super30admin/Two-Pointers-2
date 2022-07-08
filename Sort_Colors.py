class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left=0
        right=len(nums)-1
        l=0
        
        while l<=right:
            if nums[l]==0:
                nums[left],nums[l]=nums[l],nums[left]
                left+=1
                l+=1
                
            elif nums[l]==2:
                nums[right],nums[l]=nums[l],nums[right]
                right-=1
                
            else:
                l+=1
                
                
        return nums
        