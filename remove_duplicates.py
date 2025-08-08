# Traverse array with fast and slow pointers, counting consecutive duplicates and copying elements only if they don’t exceed the allowed k
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow, fast, count, k = 1, 1, 1, 2
        while fast < len(nums):
            if nums[fast] == nums[fast-1]:
                count+=1
            else:
                count = 1
            if count<=k:
                nums[slow] = nums[fast]
                slow+=1
            fast+=1
        return slow
        