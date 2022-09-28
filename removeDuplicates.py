# Time Complexity : O(n), where n is the length of given array
# Space Complexity : O(1), since we are doing the operation in-place


class Solution:
    def removeDuplicates(self, nums):

        # check if the length of nums array is empty
        if len(nums) == 0:
            return 0

        n = len(nums)
        j = 1
        count = 1

        for i in range(1, n):
            # check if the current value is the same as previous value, increment count if so, else assign the count to 1 as we are encountering a new value
            if nums[i] == nums[i - 1]:
                count = count + 1
            else:
                count = 1

            # As long as count is less than or equal to 2, we are copying the value at i index to j index and then move j by 1
            if count <= 2:
                nums[j] = nums[i]
                j = j + 1

        return j
