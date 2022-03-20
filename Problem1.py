
# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : YES
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        slow = 0
        count = 1
        if len(nums) == 0:
            return 0
        for i in range(1,len(nums)):
            if nums[i] != nums[slow]:
                count = 1
            else:
                count+=1
    
            if count<=2:
                slow+=1
                nums[i],nums[slow] = nums[slow],nums[i]
        
        return slow+1