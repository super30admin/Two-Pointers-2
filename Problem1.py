class Solution(object):
    def removeDuplicates(self, nums):
        """
        Removes duplicates from the sorted array nums, allowing at most 2 duplicates to remain.
        Time complexity: O(n), where n is the length of nums.
        Space complexity: O(1).
        :type nums: List[int]
        :rtype: int
        """
        if nums is None or len(nums) == 0:
            return 0

        slow = 0  # Pointer for the current position to place the next non-duplicate element
        count = 1  # Counter to keep track of the number of duplicates
        k = 2  # Maximum number of duplicates allowed

        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                count += 1
            else:
                count = 1

            if count <= k:
                slow += 1
                nums[slow] = nums[i]

        return slow + 1
