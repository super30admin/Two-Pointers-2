# Remove Duplicates from Sorted Array II

# Time Complexity : O(N) as it is single pass algorithm
# Space Complexity : O(1) as no extra space is used.
# Did this code successfully run on Leetcode : Yes, 
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
# Approach
"""
Two pinters technique will be used. A valid index of assignment poiniting to j,
valid index to probe poiniting to i and initializing a variable count to 
calculate frequency. 

"""
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if(nums==None or len(nums)==0): # Edge Cases
            return 0
        j=1
        count=1
        for i in range (1,len(nums)):
            if(nums[i]==nums[i-1]):
                count=count+1
            else:
                count=1
            if(count<=2):
                nums[j]=nums[i]
                j=j+1
        return j