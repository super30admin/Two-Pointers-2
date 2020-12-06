# Time: O(N)
# Space: O(1)

class Solution:
    def removeDuplicates(self, nums):
        if not nums or len(nums) < 1: return 0
        print(nums)
        p = len(nums)
        changeNumber = 1
        count = 1
        for i in range(1, p):
            if nums[i] == nums[i - 1]:
                count += 1

            else:
                count = 1

            if count <= 2:
                nums[changeNumber] = nums[i]
                changeNumber += 1
        print(nums)

        return changeNumber
