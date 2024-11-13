"""
TC: O(n) to iterate throgh array
SC: O(1) constant space
"""
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        start = i = 0
        while i <len(nums):
            count = 1
            while i+1< len(nums) and nums[i]==nums[i+1]:
                i+=1
                count+=1
            for _ in range(min(2, count)):
                nums[start]=nums[i]
                start+=1
            i+=1
        return start