'''
As discussed in the class, I followed the same pattern.
Two pointer starting from the same position: Fast and Slow.
'''

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        fast = 0
        slow = 0
        total_count = len(nums)
        count = 0
        k=2

        while(fast< total_count):
            if(fast>0 and nums[fast]==nums[fast-1]):
                count+=1
            else:
                count=1

            if(count<=k):
                nums[slow] = nums[fast]
                slow+=1

            fast+=1

        return slow
