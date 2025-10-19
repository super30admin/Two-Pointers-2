# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

'''
Slow pointer tracks the spot where we can place the next value (taking k steps at a time).
Fast pointer always moves by one, counting the number of same element seen.
'''
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k = 2

        if len(nums) <= k:
            return len(nums)
        
        slow = 0
        fast = 0
        count = 0
        
        while fast < len(nums):
            if nums[fast] == nums[fast-1]:
                count += 1
            else:
                count = 1
            
            if count <= k:
                nums[slow] = nums[fast]
                slow += 1 # Spot has been used

            fast += 1

        return slow
            