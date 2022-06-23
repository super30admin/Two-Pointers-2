# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :Yes, slow counter increment was hard to grasp
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        if nums ==None or len(nums)==2:
            return len(nums)
        slow,count=1,1
    
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:
                count+=1
            else:
                count=1
            if count<=2:
                nums[slow]=nums[i]
                slow+=1
            
        return slow
        