#TC O(n) and SC O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if nums == None or len(nums)==0:
            return 0
        cnt = 1
        slow = 1
        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                cnt = cnt + 1
            else:
                cnt = 1
            if cnt <= 2:
                nums[slow] = nums[i]
                slow = slow + 1
        return slow
