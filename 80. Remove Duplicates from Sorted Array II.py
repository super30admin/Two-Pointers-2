#Time: O(n)
#space: O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n= len(nums)
        if(n==0):
            return []
        j=1
        count=1
        for i in range(1,n):
            if(nums[i-1] == nums[i]):
                count=count + 1
            else:
                count=1
            if(count <=2):
                nums[j]= nums[i]
                j = j+1
        return j


        
