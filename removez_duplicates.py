class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if nums is None or len(nums)==0:
            return 0
        slow=1
        fast=1
        while(fast<len(nums)):
            if(nums[fast]==nums[fast-1]):
                fast+=1
            else:
                nums[slow]=nums[fast]
                slow+=1
                fast+=1
        return slow

