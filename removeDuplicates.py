# Two-pointer: Ensures each element appears at most k times
# TC: O(N) We traverse the list once with two pointers
# SC: O(1) Modifies input array in-place, using constant extra space
from typing import List


class Solution:

    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) <= 2:
            return len(nums)  # If 2 or fewer elements, return as is.

        slow, fast = 1, 1
        count = 1
        k = 2  # Maximum allowed occurrences

        while fast < len(nums):
            # If the current number is the same as the previous one, increment count
            if nums[fast] == nums[fast - 1]:
                count += 1
            else:
                count = 1  # Reset count for a new number

            # If the count is within the allowed limit, place the element at the slow pointer
            if count <= k:
                nums[slow] = nums[fast]
                slow += 1  # Move the slow pointer to the next valid position

            fast += 1  # Always move the fast pointer to check the next element

        return slow  # New length of modified array


nums = [1, 1, 1, 2, 2, 3]
sol = Solution()
length = sol.removeDuplicates(nums)
print(length)  # Output: 5
print(nums[:length])  # Output: [1, 1, 2, 2, 3]
