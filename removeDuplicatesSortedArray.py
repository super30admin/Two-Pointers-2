'''
-- Passed test cases on LeetCode
'''
class Solution:
    #O(n) -- Time Complexity ; O(1) - Space Complexity
    def removeDuplicates(self, nums: List[int]) -> int:
        """
        :type nums: List[int]
        :rtype: int
        """

        if (nums == None or len(nums) == 0):
            return 0

        count = 0
        slow = 0;
        fast = 1

        while (fast < len(nums)):
            if (nums[fast] == nums[slow]):
                if (count < 1):
                    count += 1
                    slow += 1
                    nums[slow] = nums[fast]
                    fast += 1
                else:
                    fast += 1
                    while (fast < len(nums) and nums[fast] == nums[fast - 1]):
                        fast += 1
            else:
                if (count == 1):
                    count = 0
                    slow += 1
                    nums[slow] = nums[fast]
                    fast += 1
                else:
                    slow += 1
                    nums[slow] = nums[fast]
                    fast += 1

        return slow + 1
        
        
