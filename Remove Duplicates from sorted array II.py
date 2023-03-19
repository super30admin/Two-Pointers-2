# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i, j = 0, 0

        while j < len(nums):
            counter = 1
            while (j + 1) < len(nums) and nums[j] == nums[j + 1]:
                j += 1
                counter += 1

            for swap in range(min(2, counter)):
                nums[i] = nums[j]
                i += 1
            j += 1
        return i
