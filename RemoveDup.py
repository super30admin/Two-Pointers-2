# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 0:
            return 0
        sptr = 1
        fptr = 1
        cnt = 1

        size = len(nums) - 1

        while fptr <= size:
            prev = nums[fptr - 1]
            current = nums[fptr]

            if prev == current:
                cnt = cnt + 1
            else:
                cnt = 1

            if cnt <= 2:
                nums[sptr] = nums[fptr]
                sptr += 1

            fptr += 1

        return sptr
