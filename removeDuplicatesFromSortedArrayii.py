# Time Complexity : O(n), where n is the length of the input array
# Space Complexity : O(1), in-place modification using constant space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # I use a write pointer to track the position for valid elements
        write = 0

        for read in nums:
            # Accept the element if we have written fewer than 2 so far,
            # or if it's different from the element two places before
            if write < 2 or read != nums[write - 2]:
                nums[write] = read
                write += 1

        return write
