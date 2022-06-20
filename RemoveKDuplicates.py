class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        '''Time Complexity: O(n)
        Space Complexity: O(1)'''
        
        k=2 # if k duplicates are allowed. here k is 2
        if len(nums)==0:
            return 0        
        if len(nums)==1:
            return 1
        count=1
        #Take 2 pointers fast and slow.
        
        slow=1
        
        for fast in range(1, len(nums)):
            #if the currrent fast number is equal to the previous, increment count
            if nums[fast]==nums[fast-1]:
                count+=1
            #else reset count
            else:
                count=1
                
            #if count is less or equal, then overwrite slow by fast and increment slow
            if count<=k:
                nums[slow]=nums[fast]
                slow+=1
        return slow
        
