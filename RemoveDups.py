# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english : We have two pointers slow and i, we check at any given point if
# count is less than k(here it is 2) then we overwrite the value at slow and increment slow, if not then increment the count until it reaches the k value

# Your code here along with comments explaining your approach

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 1
        count = 1
        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                count += 1
            else:
                count = 1

            if (count <= 2):
                nums[slow] = nums[i]
                slow += 1

        return slow