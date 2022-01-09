# Time Complexity : o(n)
# Space ComplexityL:0(1)
# Did it run on leetcode:Yes
# Any problem you faced while coding this :No
# Solved the problem by maintaining two pointers and a counter


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
#         track insertion position
        i =1 
#     track curr pos in array
        j = 1
        counter = 1
        
        while(j < len(nums)):
            
            if nums[j] == nums[j-1]:
                counter +=1
            else:
                counter = 1
            if (counter <=2):
                nums[i] = nums[j]
                i = i+1
            j = j+1
            
        return i
                
            