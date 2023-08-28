# Time Complexity : O(N)
# Space Complexity : O(1) as no extra space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : It took some time to understand the logic clearly


class Solution:

    def removeDups2(self, nums) -> int:

        slow, count = 1, 1
        for fast in range(1, len(nums)):

            if nums[fast] == nums[fast - 1]:
                count += 1
            else:
                count = 1
            
            if count < 3:
                nums[slow] = nums[fast]
                slow += 1
        return slow