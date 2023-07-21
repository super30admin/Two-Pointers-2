# Time Complexity: O(n)
# Space Complexity : O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) <= 2:
            return len(nums)

        slowP = 2
        for fastP in range(2, len(nums)):
            if nums[fastP] != nums[slowP - 2]:
                nums[slowP] = nums[fastP]
                slowP += 1

        return slowP
