# Time Complexity : O(n)
# Space Complexity : 0(1)

# Did this code successfully run on Leetcode : 
# YEs

# Any problem you faced while coding this : 

# Your code here along with comments explaining your approach



class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        p_slow = 0
        p_fast = 0
        cnt = 1
        
        #using 2 pointers. 
        while p_fast < len(nums):
            if p_fast > 0 and nums[p_fast] == nums[p_fast-1]:
                cnt += 1
            else: 
                cnt = 1
            
            if cnt > 2:
                p_fast += 1
            else:
                nums[p_slow] = nums[p_fast]
                p_slow += 1
                p_fast += 1
                
        return p_slow
            