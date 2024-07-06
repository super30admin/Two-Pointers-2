# // Time Complexity : O(n) 
# // Space Complexity : O(1)   
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : No because i attended the class and then did the solution

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow,count = 0, 1
        for fast in range(1,len(nums)):
            if nums[fast] == nums[fast-1]:
                count += 1
            else:
                count = 1
            
            if count <= 2:
                slow += 1
                nums[slow] = nums[fast]
        
        return slow + 1
    
# Approach:
# Same as taught in the class