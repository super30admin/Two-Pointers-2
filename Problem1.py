# time complexity :o(N)
#space : O(1)
class Solution(object):
    def removeDuplicates(self, nums):
        n = len(nums)
        if n == 0:
            return 0
        """
        :type nums: List[int]
        :rtype: int
        """
        i = 1 
        j = 1 
        count  =1
        curr_val = nums[0]
        
        while i < n:
            if nums[i] == curr_val and count <2:
                nums[j] = nums[i]
                count = count + 1
                j = j +1 
            elif nums[i]!=curr_val:
                count = 1
                curr_val = nums[i]
                nums[j] = nums[i]
                j = j +1
            i = i + 1
        return j
        