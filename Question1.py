#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        # Edge Condition
        if len(nums)<3: return len(nums)
        
		# Main Logic
		
        ind = 2  # Pointer from where we need to replace elements
        for i in range(2, len(nums)):
            if nums[i]!=nums[ind-2]:
                nums[ind] = nums[i]
                ind+=1
        return ind