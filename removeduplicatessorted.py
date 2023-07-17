#Time Complexity - O(n)
# Space - O(1)

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        last_non_dup = 0
        num = float("-inf")
        index = 0
        count=0
        while(index<len(nums)):
           
            if nums[index]!=num:
                num =nums[index]
                count=0
            if count>=2:
                index+=1
           
            elif count<2 and index<len(nums):
                while(index<len(nums) and last_non_dup<len(nums) and nums[index]==num and count<2 ):
                   
                    count+=1
                    nums[last_non_dup]=num 
                    last_non_dup+=1
                    index+=1
        
        return last_non_dup