# https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

# Time Complexity : O(N) where N is number of elements in the array.
# Space Complexity : O(1).
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

# Your code here along with comments explaining your approach.
# Approach - We need two pointers. One pointer to find the next insert position and other pointer to keep track of
# which element to be inserted. Fast pointer moving forward and keeps counting the frequency of the element
# If the frequency is less than 2, then we update the value at slow pointer and increment slow.
# At the end we return the slow pointer index.


from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 0
        count = 0
        for fast in range(len(nums)):
            if fast != 0 and nums[fast] == nums[fast - 1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[slow] = nums[fast]
                slow += 1
        return slow