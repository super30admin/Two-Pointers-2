# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english

#We keep 2 pointes slow and fast and if we encounter a variable 
# more than 2 times then we make the next elemnt that elemnt and proceed further
# Note --> We traverse from 1st element so that we can compare 0th and 1st element


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums)==0 or nums==None:
            return []
        
        slow=1
        fast=1
        count=1
        
        for fast in range(1,len(nums)):
            if nums[fast]==nums[fast-1]:
                count+=1
            else:
                count=1
            
            if count<=2:
                nums[slow]=nums[fast]
                slow+=1
        return slow
                
        