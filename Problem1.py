# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#
class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        if len(nums) == 1:
            return 1
        slow = 1
        count = 1
        for high in range(1, len(nums)):
            x = nums
            if nums[high] == nums[high-1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[slow] = nums[high]
                slow += 1
        return slow


check = Solution()
print(check.removeDuplicates([1, 1, 1, 2, 2, 3]))
