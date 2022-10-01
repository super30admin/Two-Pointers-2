# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this : No


class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 1
        j = 1
        
        for l in range(1, len(nums)):
            
            if nums[l] == nums[l-1]:
                count+=1
            else:
                count = 1
            
            if count<=2:
                nums[j] = nums[l]
                j+=1
        return j           