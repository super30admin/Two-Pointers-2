class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1
        j = 1
        for i in range(1,len(nums)):
            if nums[i-1]==nums[i]:
                count = count+1
            else:
                count = 1
            if (count<=2):
                nums[j]=nums[i]
                j = j + 1
        return j

        
