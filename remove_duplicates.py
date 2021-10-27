class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
#         i is used to traverse the entire array
#          TC====> O(n)
#          sc====>O(1)
        count=1
        i=1
        j=1
        while(i<len(nums)):
            if nums[i]==nums[i-1]:
                count=count+1
                
            else:
                count=1
            
            if (count<=2):
                nums[j]=nums[i]
                j=j+1
                
            i=i+1
#         Here we are returning J because j points to the last correct number after that j pointer 
# we don't need to include those numbers at all
        return j