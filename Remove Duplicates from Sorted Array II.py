class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if (nums == None or len(nums) == 0):
            return 0
        
        j = 1
        count = 1
        
        for i in range(1,len(nums)):
            if (nums[i] == nums[i-1]):
                count +=1
            else:
                count = 1
            if count <=2:
                nums[j] = nums[i]
                j+=1
        return j
