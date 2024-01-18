# Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)
        if n == 0:
            return 0
        index = 0
        count = 1
        for i in range(1,n):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                index += 1
                nums[index] = nums[i]
        return index + 1

# Time complexity O(n)
# Space complexity O(1)