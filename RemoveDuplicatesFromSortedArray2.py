"""
Time Complexity: O(n)
Space Complexity: O(1)
"""

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 0 or nums == None:
            return 0

        ptr = 1
        count = 1

        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                count += 1
            else:
                count = 1

            if count <= 2:
                nums[ptr] = nums[i]
                ptr += 1
        return ptr


