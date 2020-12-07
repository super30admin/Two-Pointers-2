# Time Complexity - O(N)

# Space Complexity - O(1)

# Did this code successfully run on Leetcode : Yes

# Any problem you faced while coding this : No

# Approach
# I use a two pointer approach where I maintain a count which is increment when adjacent elements are same.
# If the count is less than 2 and the previous element is not same then I swap.


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return None

        i, j, count = 1, 1, 1
        while (i < len(nums) and j < len(nums)):
            if nums[i] == nums[i - 1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[j] = nums[i]
                j += 1
            i += 1

        return j

