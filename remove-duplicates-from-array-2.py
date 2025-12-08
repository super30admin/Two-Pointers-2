# Assign a slow pointer as 0 and count as 1. Loop through nums from index 1 and 
# check if nums[i]==nums[i-1]. If they are increment the counter. Else reset the counter to 1
# if the counter is <= 2 increment slow and copy the value at i to slow. Return slow+1

# Time complexity: O(n)
# Space complexity: O(1)


class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        slow=0
        count=1
        n=len(nums)
        for i in range(1,n):
            if nums[i]==nums[i-1]:
                count+=1
            else:
                count=1
            if count<=2:
                slow+=1
                nums[slow]=nums[i]
        
        return slow+1
            
            
