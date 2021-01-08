# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# Two pointers i and j at 1 and 2 position.
# If i-1 not equal to j increment i by 1.
# Swap i with j and increment j by 1


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)

        if n < 3:
            return n

        i, j = 1, 2

        while j < n:
            if nums[i - 1] != nums[j]:
                i += 1

            nums[i] = nums[j]
            j += 1

        return i + 1
