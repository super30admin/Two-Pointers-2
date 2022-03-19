#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : YES

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        start = 1
        count = 1
        for i in range(1,len(nums)):
            if nums[i] == nums[i-1]:
                count +=1
            else:
                count = 1
            if count <= 2:
                nums[start] = nums[i]
                start +=1
                
        return start
                
            
                
            