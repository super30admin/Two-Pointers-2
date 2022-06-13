# Time: O(n), space: O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 1
        count = 1

        for i in range(1, len(nums)):  # i is for iterating through array, slow is for overwritng, count is for chk
            if (nums[i - 1] == nums[i]):
                count += 1
            else:
                count = 1

            if (count <= 2):
                nums[slow] = nums[i]
                slow += 1

        return slow
