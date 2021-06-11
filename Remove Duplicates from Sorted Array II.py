from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums)==0:
            return 0
        j=1 #slow
        count=1
        for i in range(1,len(nums)): #starting i from 1st index as 0th index element is always unique
            if (nums[i]==nums[i-1]):
                count+=1
            else:
                count=1
            if(count<=2):
                nums[j]=nums[i]
                j+=1
        return j

s=Solution()
print(s.removeDuplicates([1,1,1,2,2,3]))
