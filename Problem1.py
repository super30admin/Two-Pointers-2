# Time complexity : O(n)
# Space complexity : O(1)
# Leetcode : Solved and submitted

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)
        # curr is the pointer at which the current element is to be placed and count is to keep the count of each duplicate to 2
        curr = 1
        count = 1
        
        # starting from the first element, compare the 2nd and it's previous element, if they are same, increase the count and check for swapping
        # else resert the count to 1
        for i in range(1,n):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
             # if count is less than 2, then copy the element at i position to the current element, so for each duplicate, we just keep only 2 elements
            # curr is the pointer which is the elements that we will return, which is after removing the duplicates
            if count <= 2:
                nums[curr] = nums[i]
                curr += 1
        
        return curr
