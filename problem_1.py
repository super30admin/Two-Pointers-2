# Time O(N)
# Space O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return -1
        j = 1 
        count = 1
        for i in range(j, len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[j] = nums[i]
                j += 1
        return j


        