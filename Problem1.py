# 80. Remove Duplicates from Sorted Array II

# Time Complexity: O(n)
# Space Complexity: O(1)

# Approach:
# Use two pointers to iterate through the array.
# Use a variable to keep track of the count of duplicates.
# If the count is less than 2, move the slow pointer and replace the current element with the fast pointer.
# If the count is 2, move the fast pointer until the current element is different from the previous element.
# Replace the current element with the fast pointer and reset the count.
# Return the slow pointer.


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1
        slow = 1
        for fast in range(1, len(nums)):
            if nums[fast] == nums[fast-1]:
                count += 1
            else:
                count = 1

            if count <= 2:
                nums[slow] = nums[fast]
                slow += 1

        return slow