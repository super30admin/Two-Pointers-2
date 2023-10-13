# // Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : YES


# // Three line explanation of solution in plain english

# Two pointer approach where we iterate and store it in the same array but using a different idx pointer than the current iteration.
# This will ensure that our idx is separate than our i - and also each time we check for whether it crosses the 2 count, upon which we
# do not place it in the array


# // Your code here along with comments explaining your approach
from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1
        idx = 1

        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1

            if count <= 2:
                nums[idx] = nums[i]
                idx += 1

        return idx

