# 80. Remove Duplicates from Sorted Array II
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)
        k = 2
        slow = k
        fast = k

        while fast < n:
            if nums[slow-k] != nums[fast]:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1

        return slow

        