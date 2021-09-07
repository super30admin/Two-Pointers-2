# Did this code successfully run on Leetcode : YES

# approach
# 2 pointers
# keep swapping till count <= 2

# TC: O(n)
# SC: O(1)

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        cnt = 1
        j = 1
        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                cnt +=1
            else:
                cnt = 1
            if cnt <= 2:
                nums[j] = nums[i]
                j += 1
        return j