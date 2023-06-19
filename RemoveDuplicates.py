# Time Complexity : O(n)
# Space Complexity : O(1)

# The code ran on LeetCode

# Maintain two pointers: slow and fast. Slow pointer collects all integers with frequency less than or equal to 2. Fast pointer moves one step to the right at every time step, slow pointer is updated either when fast points to a new integer or when fast points to the same integer at slow and count is less than 2.

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        count = 1; n = len(nums)

        slow = 0

        for fast in range(1, n):

            if count < 2 and nums[fast] == nums[slow]:
                slow+=1
                nums[slow] = nums[fast]
                count+=1
            elif nums[fast] != nums[slow]:
                slow+=1
                nums[slow] = nums[fast]
                count = 1

        return slow + 1