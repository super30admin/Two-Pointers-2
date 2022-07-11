"""
Runtime Complexity: O(n) -because we run a loop and traverse each element and increment the count if the value is already present as contiguous,
else this is the first occurence of a new element so we update its count to 1. We have a check where count is less than or equal to 2, and if it's true we add them to nums[j] list and increment j to add more elements.
Space Complexity: O(1) - no extra space was created to compute the solution.
Yes, the code worked on leetcode.
Issues faced- None
"""


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums)<2:
            return len(nums)
        count = 1
        j = 1
        for i in range(1,len(nums)):
            if nums[i] == nums[i-1]:
                count+=1
            else:
                count = 1
            
            if count<=2:
                nums[j] = nums[i]
                j+=1
        return j
                
            
        