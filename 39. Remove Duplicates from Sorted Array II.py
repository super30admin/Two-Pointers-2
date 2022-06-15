class Solution:
    def removeDuplicates(self, nums):
        if nums is None or len(nums) == 0:
            return 0

        j = 1  # slow Pointer(SP)
        count = 1

        for i in range(1, len(nums)):  # i as Fast Pointer(FP)
            if nums[i] == nums[
                i - 1]:  # we check if previous element is same as the current then we increment count by 1
                count += 1
            else:
                count = 1  # If not same we reset count to 1
            if count < 3:
                nums[j] = nums[i]  # if the count is less than permissible duplicacy limit we overwrite SP with FP
                j += 1
        print(nums)
        return j


if __name__ == "__main__":
    obj = Solution()
    obj.removeDuplicates([1, 1, 1, 2, 2, 3])

# TC = O(n).
# Space complexity : O(1). Constant. No extra space used
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No
