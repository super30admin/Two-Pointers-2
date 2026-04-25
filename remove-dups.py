# O(n) time, O(1) space
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        cnt = 1
        slow = 1
        k=2
       
        for fast in range(1,len(nums)):
            if nums[fast] == nums[fast-1]:
                cnt+=1
            else:
                cnt=1
            
            if cnt <= k:
                nums[slow]=nums[fast]
                slow+=1

        return slow