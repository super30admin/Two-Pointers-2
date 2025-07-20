# Time Complexity : It is O(n) since we are iterating length of the list.
# Space Complexity : It is O(1) not creating the extra.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No, if previous value and the current value is matched then count=2 increase the right pointer till we find the unique value.

from typing import List

class Solution:
     def removeDuplicates(self, nums: List[int]) -> int:
        if (len(nums)<=2):
            return len(nums)        
        L = 0
        R = 0
        count = 1
        while R < len(nums):                       
            if nums[R-1]==nums[R] and R!=0:
                count+=1                       
            else:
                count=1            
            if count > 2:
                    R+=1 
                    continue
                    
            nums[L]=nums[R]          
            L+=1
            R+=1
        
        print(nums)
        return L+1
    
obj = Solution()
print(obj.removeDuplicates([1,1,1,2,2,3]))
#print(obj.removeDuplicates([1,1,1,2,2,2,3,3]))
# print(obj.removeDuplicates([1,1,1,2,2,3,3]))
# print(obj.removeDuplicates([0,0,1,1,1,1,2,3,3]))
# print(obj.removeDuplicates([1,1,1,2,2,2,3,3]))