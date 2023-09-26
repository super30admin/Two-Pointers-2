# two pointers. TC: O(N) SC:O(1)

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums or len(nums)==0:
            return 0
        p=1
        count=1
        
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:
                count+=1
            else:
                count=1
            if count<=2:
                nums[p]=nums[i]
                p+=1
        return p
