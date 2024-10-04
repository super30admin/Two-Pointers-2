# Time Complexity = O(n) Space Complexity = O(1)

class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        n = len(nums)
        slow, fast, count = 0, 0, 0
        k = 2
        while fast < n:
            if fast > 0 and nums[fast] == nums[fast-1]:
                count += 1
            else:
                count = 1
            if count <= k:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1
        return slow