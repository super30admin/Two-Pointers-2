'''
Two-Pointers-2

Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
'''

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int: # type: ignore
        if nums == None or len(nums) == 0:
            return 0
        count = 1
        slow = 1
        fast = 1
        for fast in range(1,len(nums)):
            if nums[fast] == nums[fast-1]:
                count += 1

            else:
                count = 1
            if count <= 2:
                nums[slow] = nums[fast]
                slow += 1
        return slow                 