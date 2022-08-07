#  80. Remove Duplicates from Sorted Array II
'''
Leetcode all test cases passed: Yes
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n is the length of nums
        Space Complexity: O(1)
        Time Complexity: O(n)
'''
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return 1
        l = 0
        curr = 1
        while curr < len(nums):
            if nums[curr] != nums[l]:
                l += 1
                nums[l] = nums[curr]
                curr += 1
            else:
                l += 1
                nums[l] = nums[curr]
                while curr < len(nums) and nums[curr] == nums[l]:
                    curr += 1
        return l + 1
