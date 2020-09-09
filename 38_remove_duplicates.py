# S30 Big N Problem #38 {Medium}

# Remove duplicates

# Time Complexity : O(n) m= no. of elements in array
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

# Approach 
# Since only max 2 elements of a no. can be present in the result, 
# to select the first and last element in the repeated array, compare previous and next element. 


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        if len(nums)==0:
            return 0
        
        if len(nums)<2:
            return len(nums)
        pos=1
        
        for i in range(1,len(nums)-1,1):
            
            if nums[i-1]!=nums[i+1]:
                nums[pos]=nums[i]
                pos+=1
        
        nums[pos]=nums[-1]
        
        return pos+1
        