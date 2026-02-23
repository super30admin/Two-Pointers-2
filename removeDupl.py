# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach: Use two pointers, fast scans the array while slow writes valid elements in-place.
# Track occurrence and allow at most k = 2 and copy only when count ≤ k

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        fast = 0
        slow = 0
        cnt = 0
        k = 2

        while fast < len(nums):
            if fast != 0 and nums[fast] != nums[fast - 1]:
                cnt = 1
            else:
                cnt += 1
            
            if cnt <= k:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1
        
        return slow