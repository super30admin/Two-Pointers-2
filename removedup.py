class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k=2
        slow=1
        count=1
        for i in range(1,len(nums)):
            if(nums[i]==nums[i-1]):
                count+=1
            else:
                count=1
            
            if count<=k:
                nums[slow]=nums[i]
                slow+=1
                
        return slow