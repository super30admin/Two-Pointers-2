# Time complexity: O(n) where n is the length of the array.
# Space complexity: O(1).
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 0: return 0
        count = 1
        slow = 1
        fast = 1
        while fast < len(nums):
            if nums[fast] == nums[fast - 1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1
        return slow