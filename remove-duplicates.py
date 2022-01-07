# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        j = 1  # setting a pointer
        count = 1  # initializing a count variable to keep track of number of occurences

        # starting from the second element of the array through each element
        for i in range(1, len(nums)):

            if nums[i] == nums[i - 1]:  # if the current and previous value is same
                count = count + 1  # increment the count

            else:
                count = 1  # reset the counter to 1 if new element is found

            if count <= 2:
                nums[j] = nums[i]  # overwrite the element at index j in array
                j = j + 1

        return j
