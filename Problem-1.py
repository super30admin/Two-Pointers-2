#tc: O(n)
#sc: O(1)
class Solution:
    def removeDuplicates(self, nums) -> int:
        if len(nums) == 1: return 1
        i = 0
        j = i + 1
        while j < len(nums):
            if nums[i] != nums[j]:
                i += 1
                j += 1
            else:
                k = j + 1
                if k >= len(nums):
                    return len(nums)
                while nums[j] == nums[k]:
                    del nums[k]
                    if k >= len(nums):
                        break
                i = k
                j = i + 1
        return len(nums)