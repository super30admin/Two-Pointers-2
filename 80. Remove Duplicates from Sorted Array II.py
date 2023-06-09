#TC = O(n)
#SC = O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1
        slow = 0
        fast = 0
        t = 2
        for fast in range(1,len(nums)):
            if nums[fast]==nums[fast-1]:
                count+=1
            else:
                count=1
            if count<=t:
                slow+=1
                nums[slow]=nums[fast]
        return slow+1