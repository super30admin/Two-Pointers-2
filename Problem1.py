# https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

# Two pointer appraoch.

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 0
        fast = 0
        count = 0

        while fast < len(nums):
            if fast > 0 and nums[fast] == nums[fast - 1]:
                count += 1
            else:
                count = 1

            if count <= 2:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1

        return slow