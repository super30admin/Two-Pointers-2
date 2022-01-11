#Time Complexity O(n)
#Space Complexity O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        c1 = 1
        total = 1
        
        for x in range(1,len(nums)):
            if nums[x] == nums[x-1]:
                total+=1
            else:
                total=1
            if total <=2:
                nums[c1]= nums[x]
                c1+=1
        return c1
        
        
        
        
            
