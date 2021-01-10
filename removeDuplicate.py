# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        """
        Used two pointers a left and right pointer.
            If the pointers are the same then just increase the right pointer.
            If it isn't the same swap the left pointer with right pointer
        
        """
        if not nums:
            return 0
        
        left = 1 
        for right in range(2,len(nums)):
            if nums[right] != nums[left-1]:
                left += 1
                temp = nums[left]
                nums[left] = nums[right]
                nums[right] = temp
                
        return left + 1