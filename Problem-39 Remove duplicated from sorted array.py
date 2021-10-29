# 80. Remove Duplicates from Sorted Array II
# https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

# Time complexiety: O(n)
# Space complexiety: O(1)

class Solution:
    def removeDuplicates(self, nums) -> int:
        count = 1
        i = 1
        k = 1

        while i < len(nums):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            
            if count <= 2:
                nums[k] = nums[i]
                k += 1
            i += 1
            
        return k

obj = Solution()
obj.removeDuplicates([1,1,1,2,2,3,4,5,6])