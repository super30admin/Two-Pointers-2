# TP Approach
# TC - O(n)
# SC - O(1)
# Refer notes

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # base case
        if nums is None or len(nums) == 0: return 0

        count = 1
        j = 1
        n = len(nums)

        for i in range(1, n):
            if nums[i - 1] == nums[i]:
                count += 1
            else:  # if nums[i-1] != nums[i] we reset count to 1
                count = 1
            if count <= 2:
                nums[j] = nums[i]
                j += 1

        return j