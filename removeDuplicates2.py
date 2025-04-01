# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach:
# 1. For each element, we maintain its count in the count variable
# 2. We maintain fast and slow pointers to point to the position the next unique element should be placed at and to find the next unique element respectively.
# 3. Iterating over the array from left to right, if the value at the fast pointer is same as previous index, we increment the count
# 4. While count is less than 2, we replace the values at slow pointer with the values at fast pointer
from typing import List
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 0
        fast = 0
        count = 0
        k = 2
        while fast < len(nums):
            # If values at fast and fast-1 are equal, it means that it is a duplicate value and so we increment the count
            if fast != 0 and nums[fast] == nums[fast-1]:
                count += 1
            else:
                count = 1

            # If we have encountered the same value for <= 2 times, we can replace it at the slow pointer
            if count <= k:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1
        # Finally, slow pointer will be pointing at the index immediately after all the values are replaced <= 2 times.
        return slow
    
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k = 2
        # Slow pointer always holds the position for the next unique element
        slow = k
        fast = k

        while fast < len(nums):
            # if nums[slow-k] == nums[fast], it would mean that fast pointer is pointing to a third duplicate
            # Think about what would happen if there are multiple same values on the right side.
            if nums[slow - k] != nums[fast]:
                # If that is not the case, it would mean that we found a unique element and we need to store it at slow pointer
                nums[slow] = nums[fast]
                # Increment slow pointer
                slow += 1
            # If the fast pointer is holding a third duplicate, we increment it
            fast += 1
        return slow