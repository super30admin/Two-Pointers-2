"""
Time Complexity: O(n)
Space Complecity: O(1)
"""

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int: 
        s =0 
        count = 1

        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1

            if count <= 2:
                s += 1
                nums[s] = nums[i]
        return s + 1
        