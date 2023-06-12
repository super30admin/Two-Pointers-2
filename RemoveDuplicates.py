# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

# Approach is to remove the elements greater than 2 occurance which is considered to be duplicate by using fast f and slow s 
# pointers when count is less than 2 then move the fast with slow pointer variable, return the slow pointer.

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        s=0
        c=1
        n=len(nums)
        for f in range(1,n):
            if(nums[f]==nums[f-1]):
                c+=1
            else:
                c=1
            if(c<=2):
                s+=1
                nums[s]=nums[f]
        
        return s+1