# Time Complexity : Add - O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
'''
1. I have used 1 pointer j along with i as the looping variable.
2. At each instant I  incrementing the count if it is equal to the previous element. If not I reset it
3. j is the waiting pointer, if condition is disobeyed, it stays there until a correct exchange is made
'''
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        if nums == [] or len(nums) < 2:
            return len(nums)
        
        count = 1
        j = 1
        for i in range(1, len(nums)):
            
            if nums[i] == nums[i-1]:
                count += 1                
            else:
                count = 1 
                
            if count <= 2:
                nums[j] = nums[i]
                j += 1