# Problem 1 - Remove Duplicates from Sorted Array II
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
'''
In this problem, we use two pointers: one for writing the elements and the other for tracking unique elements. The fast pointer 
iterates through the array, comparing each element with the previous one to manage the count. This method works for any value of 
k because we check the counter against k, and if it's less than or equal to k, we store the element pointed to by the fast pointer 
at the position pointed to by the slow pointer.
'''

# Your code here along with comments explaining your approach
from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        length = len(nums)
        # this pointe is used to write the element 
        slowPointer = 1
        # counter for counting the element frequency
        count = 1
        # i counter is used for going to unique element
        for i in range(1, length):
            # Will check if the elements and previous element is same then increment the counter
            if nums[i] == nums[i - 1]:
                count += 1
            # else it means we found next unique element so reset the counter for the next element
            else:
                count = 1
            # if the count is less than or equal to 2 means we need to write element pointed by i pointer at slowPointer position and then increment the slowPointer
            if count <= 2:
                nums[slowPointer] = nums[i]
                slowPointer += 1
        return slowPointer