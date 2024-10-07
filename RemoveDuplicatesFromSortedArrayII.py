# Time Complexity : O(n) because you iterate through the array once
# Space Complexity : O(1)  No extra space is created
# Did this code successfully run on Leetcode : Yes

# Your code here along with comments explaining your approach
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        #Assign required variables
        n=len(nums)
        #Slow pointer is to hold the place where the incoming element will be inserted
        slow = 0
        #Fast pointer is to decied what is the incoming element
        fast = 0
        count = 0
        #K is fixed 2 as given in the question
        k = 2
        #Iterate through the array until last element
        while(fast<n):
            #Checking if this the second or more than second occurence of an element
            if(fast>0 and nums[fast]==nums[fast-1]):
                count+=1
            #If the element is occuring for the first time
            else:
                count=1
            #If the occurence of element is less than or equal to 2
            if(count<=k):
                #Add the element of faster to the position at slow pointer
                nums[slow]=nums[fast]
                slow+=1
            #Increment fast pointer everytime either checking the element or adding it at the slow pointer position 
            fast+=1
        #We are asked to return the next index of final element after the changes
        return slow