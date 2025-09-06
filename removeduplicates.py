# Time Complexity : O(N)
# Space Complexity : O(1)  
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach:
# I am using a pointer 'allo' to keep track of the position to place the next allowed element.
# I iterate through the array starting from the third element, and for each element, I check if it is different from the element at position 'allo-2'.
# If it is different, I place it at position 'allo' and increment 'allo'. Finally, I return 'allo', which represents the length of the modified array with duplicates removed.


from typing import List
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) <= 2:
            return len(nums)
        allo = 2
        for i in range(2,len(nums)):
            if nums[i] != nums[allo-2]:
                print(nums[allo-2])
                nums[allo] = nums[i]
                allo += 1
        return allo
        