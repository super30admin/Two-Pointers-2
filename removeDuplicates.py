'''
Timecomplexity O(n)
Spacecomplexity O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
'''

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        if len(nums) == 0: return 0
        
        n  = len(nums)
        i = 1
        j = 1
        count = 1
        while(i<n):
            if nums[i] ==  nums[i-1]:
                count +=1
            elif nums[i]  != nums[i-1]:
                count = 1
            
            if count <= 2:
                nums[j] =  nums[i]
                j+=1
            i+=1
            
        return j
        