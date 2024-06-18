"""
Two-Pointers-2

Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
Trick is we have to start at 1 & keep count as 1 then we can check prev ele is same if yes we increment it else we can just 
reset the count. Also check if count comes under the max elements we can store if yes insert it and increment the final result
index.
"""

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums or len(nums) == 0:
            return 0

        n = len(nums)
        count = 1
        j = 1

        for i in range(1, n):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1

            if count <= 2:
                nums[j] = nums[i]
                j+=1

        return j