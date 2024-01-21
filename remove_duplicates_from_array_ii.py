class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0
        slow = 1
        count = 1
        for i in range(1,len(nums)):
            if nums[i] == nums[i-1]:
                count = count + 1
            else:
                count = 1
            if count <= 2:
                nums[slow] = nums[i]
                slow = slow + 1
        return slow