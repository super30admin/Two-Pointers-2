#Time Complexity : O(n) since we iterate through the list
#Space Complexity : O(1) since we are not using any extra space
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No

#Approach: We take two pointers (slow at 0 and fast at 1). Take a count variable initially 1. If value at fast pointer and previous it
# is same, we increase count by 1. If the count is less than or equal to 2, we move the slow pointer by 1 to right and move the value and fast pointer
# to the slow pointer. In the end return slow pointer + 1.

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums and len(nums) == 0: return 0
        s = 0
        count = 1
        for f in range(1, len(nums)):
            if nums[f] == nums[f-1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                s += 1
                nums[s] = nums[f]
        return s+1