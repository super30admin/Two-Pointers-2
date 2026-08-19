# https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/

# Time complexity: O(n) 
# Space complexity: O(1)
# Explanation: Maintain two points, one to check count and one to act as the current index being written to. Keep iterating the elements and then return the 2nd pointer value.

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        i = 1
        j = 1
        count = 1

        while i < len(nums):
            if nums[i] == nums[i-1]:
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
        return j + 1
