# Approach:
# The goal is to remove duplicates from a sorted array such that each element appears at most twice.
# We use two pointers: 'i' to place the next valid element and 'j' to iterate through the array.
# If the current element nums[j] is not equal to nums[i-2], it's safe to place it at nums[i].

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) < 3:
            return len(nums)
        i = 2        
        for j in range(2, len(nums)):
            if nums[j] != nums[i-2]:
                nums[i] = nums[j]
                i += 1
        return i

# Time Complexity: O(n), where n is the length of the input list.
# Space Complexity: O(1), since the operation is done in-place.
