class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        :time complexity:O(n)
        :space complexity:O(1)
        """
        
        n=len(nums)
        fast=1
        slow=1
        count=1
        
        for fast in range(1,n):
            # check consecutive values, if same increase counter
            if nums[fast]==nums[fast-1]:
                count+=1       
            else:
                count=1
            if count<=2:
                nums[slow]=nums[fast]
                slow+=1
                
        return slow
                
            
        