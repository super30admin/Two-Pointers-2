class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        if len(nums)<=2:
            return len(nums)
        slow=1
        fast=1
        count=1
        while(fast<len(nums)):
            if nums[fast]==nums[fast-1]:
                count+=1
            else:
                count=1
            if count<=2:
                nums[slow]=nums[fast]
                slow+=1
                fast+=1
            else:
                while(fast<len(nums) and nums[fast]==nums[fast-1]):
                    fast+=1
        return slow
        #Time O(n)
        #Slow O(1)
