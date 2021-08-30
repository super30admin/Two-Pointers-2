#time comp - O(n)
#space comp - O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        j=1
        i=1
        count=1
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:
                count=count+1
            else:
                count=1
            if count<=2:
                nums[j]=nums[i]
                j=j+1
        return j
                
        
