# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
# Use 2 pointers : Slow pointer and fast pointer
# When new element is encountered, set the count to 1 and replace slow pointer with new element
# Slow pointer is not incremented when the element is repeated more than 2 times
# // Your code here along with comments explaining your approach


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        j = 1
        count = 1
        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:  # current element equal to prev element
                count += 1              # increment the count
            else:
                count = 1               # by default count value is 1
            if count <= 2:
                nums[j] = nums[i]
                j += 1
        return j


