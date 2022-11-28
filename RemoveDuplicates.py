class Solution:
    """
    Time complexity - O(n). n - size of nums
    Space complexity - O(1)
    """
    def removeDuplicates(self, nums: list[int]) -> int:
        if len(nums) < 3:
            return len(nums)
        # pointer in array where nums[1..i] does not have duplicates.
        i = 1 
        # pointer in array which iterates over array.
        j = 1
        count = 1
        while j < len(nums):
            if nums[j] == nums[j-1]:
                count += 1
            # when new number is seen. start the count
            else:
                count = 1
            # copy at max 2 nums of same type.
            if count <= 2:
                nums[i] = nums[j]
                i += 1
            j += 1
        return i
