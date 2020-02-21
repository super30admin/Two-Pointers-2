#Time Complexity : O(n)

#Space Complexity : O(1) 

#Did this code successfully run on Leetcode : Yes

#Any problem you faced while coding this :None

# =============================================================================
# Solution: Take 2 pointers slow and fast. Intialize them at 2nd index because at max we can have 2 elements with same value.
#Hence we are not concerned about first 2 elements and then compare element at fast wih element at slow-2 because before slow,
#all elements are at their position and in the nd we can return slow which is the length of the array required as output.
# ===============================================================================

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0
        slow  = 2
        for fast in range(2,len(nums)):
            if nums[fast] != nums[slow-2]:
                nums[slow] = nums[fast]
                slow += 1
        return slow
                