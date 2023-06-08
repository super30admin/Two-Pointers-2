# TC: O(n)
# SC: O(1)

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)
        left, right = 1, 1
        count = 1
        while right < n:
            if nums[right] == nums[right - 1]:
                count += 1
            else:
                count = 1

            if count <= 2:
                nums[left] = nums[right]
                left += 1
            right += 1
        return left

