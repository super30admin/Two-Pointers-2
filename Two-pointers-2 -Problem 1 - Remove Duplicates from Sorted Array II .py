"""
 FAANMG Problem #39 {Medium}

80. Remove Duplicates from Sorted Array II

Time Complexity : O(N)

Space Complexity : O(1)


Did this code successfully run on Leetcode : Yes
  

We are keeping a count to track the repeated count of the numbers
slow pointer to replace and mainting the repeated array values


while iterating through the list 
 we are mainting the count of the numbers.
 if its less than tha target then we are swapping it with the slow pointer and incrementing it
 
 if the count exceeds the target value it would be handled and replaced by the slow pointer with the next value

@name: Rahul Govindkumar_RN27JUL2022
"""


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        if(len(nums)==0):
            return 0
        
        
        count = 1
        k =2
        slow =1
        
        for i in range (1,len(nums)):
            
            #Check repeated element
            if(nums[i] == nums[i-1]):
                count += 1
            else:
                #new element
                count = 1
             
            #Replace until the value count is less than target
            if(count <= k):
                nums[slow]= nums[i]
                slow +=1
                
        return slow
    
        