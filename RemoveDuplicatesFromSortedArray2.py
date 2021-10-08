class Solution:
    def removeDuplicates(self, nums):
        count, wi = 1, 1
        prevch = nums[0]
        for i in range(1, len(nums)):

            if nums[i] != prevch:
                count = 1
            if nums[i] == nums[i-1]:
                count += 1
            if count > 2:
                continue

            nums[wi] = nums[i]
            prevch = nums[wi]
            wi += 1
        return wi
