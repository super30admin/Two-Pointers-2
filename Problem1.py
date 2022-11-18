
# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
        # i have used 2 pointers to achieve 0(1) complexity
        # by checking the variable 'count' value we are assuring number is not repeated more than 2 times
        # We are comparing pointer element's value to previous value if it's same couter will increal
        # we are making sure that the value is not more than twice by giving condition if counter value is <= 2
        # transfering values to another pointer and printing 
        
# // Your code here along with comments explaining your approach

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        count = 1 #declaring value 1 as 1st element will be unique 
        j = 1 # so we need to start pointer from 2nd elemnt nums[1]
        
        for i in range(1,len(nums)): #starting loop from 1 instead of 0
            if nums[i] == nums[i-1]: #coparing values
                count+=1 #incrementing caouter if same as prev value
            else:
                count=1 #current value and prev value is not he same than make the couter 1
            
            #swaping code
            if count <= 2: 
                nums[j]=nums[i]
                j+=1
            
        return j


    
