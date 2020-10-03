class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        if nums is None or len(nums)==0:
            return None
        count = 0
        el = nums[0]
        index = 0
        for i in range(len(nums)):
            if nums[i] == el and count<2:
                nums[index] = nums[i]
                index+=1
                count+=1
            if nums[i]!=el:
                count=1
                el = nums[i]
                nums[index] = nums[i]
                index+=1
        return index