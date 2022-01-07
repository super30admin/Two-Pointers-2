# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i, j, cntr = 1, 1, 1
        while j < len(nums):
            if nums[j] == nums[j-1]:
                cntr += 1
            else:
                cntr = 1
            if cntr <= 2:
                nums[i] = nums[j]
                i += 1
            j += 1
        
        return i