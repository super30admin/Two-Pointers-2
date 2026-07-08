class Solution:
    def removeDuplicates(self, nums):
        if len(nums) <= 2:
            return len(nums)

        i = 2

       # If you want each number at most k times: Keep nums[j] != nums[i-k]
        for j in range(2, len(nums)):
            if nums[j] != nums[i - 2]:
                nums[i] = nums[j]
                i += 1

        return i
# using slow and fast pointers (i and j)
# TC - O(n)
# SC - O(1)