# Two-Pointers-2

## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

#Approach
# create 2 pointers starting from 0th index. Initialize the counter = 0. 
#Traverse from 0th index and at each index except 0th index check if value at index i == value at index i-1. If yes, increment counter,else set counter = 1
# check if the counter <= 2, set nums[slow] = nums[fast] and increment the counter. Once the complete List is traversed, return slow


# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1
        slow = 1

        for fast in range(1,len(nums)):
            if (nums[fast] == nums[fast-1]):
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[slow] = nums[fast]
                slow += 1
        return slow