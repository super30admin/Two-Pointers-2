# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach : Keep 2 pointers - slow and fast.
# Fast pointer moves forward when count > k and slow pointer is the index where element needs to be replaced.

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow, fast, count = 0, 0, 0
        k = 2

        while fast < len(nums):
            if fast > 0 and nums[fast] == nums[fast - 1]:
                count += 1
            else:
                count = 1

            if count <= k:
                nums[slow] = nums[fast]
                slow += 1

            fast += 1
        
        return slow

        