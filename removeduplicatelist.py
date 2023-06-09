class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if (len(nums) == 0):
            return
        slow = 0
        count = 1

        for fast in range(1, len(nums)):
            if (nums[fast] == nums[fast - 1]):
                count += 1
            else:
                count = 1
            if (count <= 2):
                slow += 1
                nums[slow] = nums[fast]
        return slow + 1
