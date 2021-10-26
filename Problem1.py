#Time complexity O(n) and space complexity O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i=1
        c=1
        j=1
       
        while i<len(nums):
#Traversing to check if previous element is same as current element  and increment the count 
            if nums[i] == nums[i-1]:
                c+=1
            else:
                c=1
# If count is less than 2 then placing the newer element to the correct position              
            if c<2:
                nums[j]=nums[i]
                j+=1
                
            i+=1
            
        return j
