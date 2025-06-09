# Time O(n)
# Space O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k = 2
        i = 2
        while i < len(nums):
            if nums[i] != nums[k-2]:
                nums[i], nums[k] = nums[k], nums[i]
                k+=1
            i+=1
        return k
