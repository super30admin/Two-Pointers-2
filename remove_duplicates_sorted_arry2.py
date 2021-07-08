"""
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Trying to come with intuitve soln of
negative indexing

// Your code here along with comments explaining your approach
Algorithm Explanation
We take a two pointer approach where try to solve two questions
a) When to replace the duplicate
b) How to keep track of the duplicates
The j pointer allows to keep track of when to swap and count allows 
to keep track of duplicates
"""
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        j = 1 #setting the counter for replacing the elem as j=1
        count = 1  #setting the counter for keeping track of duplicate elements
        
        for i in range(1,len(nums)):
            #incementing the count as thet elem is duplicate
            if nums[i] == nums[i-1]:
                count+=1
            #resetting the count to 1
            else:
                count=1
            #this is used for tracking jth element to be replaced with ith element 
            # when the count exceeds 2
            if count <=2:
                nums[j] = nums[i]
                j+=1
            
        return j