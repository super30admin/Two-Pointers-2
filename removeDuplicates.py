# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums)==0:
            return 0
        
        i = 0
        
        while(i<len(nums)-2):
            if nums[i]==nums[i+2]:
                nums.pop(i+2)
            else:
                i+=1
        return len(nums)
                
        