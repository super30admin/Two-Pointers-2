#Problem: Remove Duplicates from Sorted Array II
"""
Approach: Used a counter to count same elements and a left and right pointer to move elements with count < 2 from r to l
t.c.=> O(n)
s.c. => O(1)
"""
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1
        l = 0
        for r in range(len(nums)):
            if r > 0 and nums[r] == nums[r - 1]:
                count += 1
            else:
                count = 1

            if count <= 2:
                nums[l] = nums[r]
                l += 1

        return l
