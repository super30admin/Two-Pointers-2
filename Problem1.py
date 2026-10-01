# LEETCODE PROBLEM : 80. REMOVE DUPLICATES FROM SORTED ARRAY II
# TIME COMPLEXITY: O(N) where N is the length of the array
# SPACE COMPLEXITY:  O(1) as we are not using any extra space in thev code



class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        k=2
        fast=k
        slow=k

        while fast<len(nums):
            if nums[slow-k]!=nums[fast]:
                nums[slow]=nums[fast]
                slow+=1
            fast+=1

        return slow