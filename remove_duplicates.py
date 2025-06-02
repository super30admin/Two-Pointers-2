#Time Complexity: O(N)
#Space Complexity: O(1)

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) <= 2:
            return len(nums)  # If array has <= 2 elements, return as is

        i = 2  # Pointer for writing
        for j in range(2, len(nums)):  # Start from index 2
            if nums[j] != nums[i - 2]:  # Compare with the element two places back
                nums[i] = nums[j]
                i += 1

        return i  # Length of the new array

        