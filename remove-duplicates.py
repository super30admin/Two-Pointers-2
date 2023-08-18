class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return 1
        end = len(nums)-1
        slow = 0
        fast = slow + 1
        count = 1

        while fast <= end:
            if nums[fast-1] == nums[fast]:
                count += 1
            else:
                count = 1
            
            if count <= 2:
                slow += 1
                nums[slow] = nums[fast]
            fast += 1

        return len(nums[0:slow+1])

