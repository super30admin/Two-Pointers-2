# Start from the beginning of the array and keep track of the number of occurrences of each element.
# If the number of occurrences is less than 2, move the element to the next position.
# If the number of occurrences is greater than 2, skip the element.

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # Allow at most two occurrences of each element
        if not nums:
            return 0
        i = 0
        for n in nums:
            if i < 2 or n != nums[i-2]:
                nums[i] = n
                i += 1
        return i
        