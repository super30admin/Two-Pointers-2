class Solution:
    def removeDuplicates(self, nums) -> int:
        low=1
        count=1
        for j in range(1,len(nums)):
            if nums[j]==nums[j-1]:
                count+=1
            else:
                count=1
            if count<=2:
                nums[low]=nums[j]
                low+=1
        return low
        