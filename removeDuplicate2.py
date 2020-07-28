# Leetcode 80. Remove Duplicates from Sorted Array II

# Time Complexity :  O(n) where n is the size of the array

# Space Complexity : O(1)

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Use two pointers, one points to the position where the next valid element can be copied.
# The other iterates over the array. If the current and previous elements are equal, increment the count
# Else reset the count to 1. As long as the count is less than or equal to 2, current element is copied into
# the valid position and its pointer is incremented.

# Your code here along with comments explaining your approach

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        next_valid = 1
        count = 1

        for current in range(1, len(nums)):
            if nums[current] == nums[current-1]:
                count += 1
            else:
                count = 1

            if count <= 2:
                nums[next_valid] = nums[current]
                next_valid += 1
        return next_valid
