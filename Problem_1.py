# LC_80 - Remove Duplicates from a Sorted Array II
# Time Complexity : O(N)
# Space Complexity : O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        l = 2
        for r in range(2,len(nums)):
            if nums[l-2] != nums[r]:
                nums[l] = nums[r]
                l = l+1
        return l