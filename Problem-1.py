
# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :yes
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach
# Use two pointers to scan the array while keeping track of how many times the current number has appeared consecutively.
# If a number appears more than twice, skip it; otherwise, copy it into the correct position.
# Continue this process through the array and return the length of the filtered portion with at most two duplicates.

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 0
        fast = 0
        while fast < len(nums):
            if fast != 0 and nums[fast] == nums[fast-1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1
        return slow