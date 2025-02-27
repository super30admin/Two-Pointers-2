# The code removes duplicates in-place, allowing at most two occurrences of each number, using two pointers (i, j) 
# to overwrite excess duplicates while keeping the first two occurrences.

# Time Complexity: O(N) (Iterates through nums once).
# Space Complexity: O(1) (Modifies nums in-place without extra storage
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0
        i = 1
        j = 1
        count = 1
        while i < len(nums):
            if nums[i] == nums[i - 1]:
                count += 1
                if count > 2:
                    i += 1
                    continue
            else:
                count = 1
            nums[j] = nums[i]
            j += 1
            i += 1
        del nums[j:]
        return len(nums)
        