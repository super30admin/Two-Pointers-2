# Time Complexity : O(n)
# Space Complexity : O(1)

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums or len(nums)==0: 
            return 0
        slow=0
        count=1 
        for fast in range(len(nums)):
            if fast>0 and nums[fast]==nums[fast-1]:
                count+=1
            else:
                count=1

            if count<=2: 
                nums[slow]=nums[fast]
                slow+=1
        return slow
