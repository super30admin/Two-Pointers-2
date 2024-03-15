# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
from typing import List
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        s = 1
        count = 1

        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1

            if count <= 2:
                nums[s] = nums[i]
                s += 1       
        return s

sc= Solution()
nums = [1,1,1,2,2,3]
print(sc.removeDuplicates(nums))