## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
# Time complexity - O(n)
# Space complexity - O(1)


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return -1
        slow, fast, count = 1, 1, 1
        while(fast<len(nums)):
            if(nums[fast] == nums[fast-1]):
                count+=1
            else:
                count = 1
            if(count<=2):
                nums[slow] = nums[fast]
                slow+=1
                fast+=1
            else:
                fast+=1
        return slow
            
        