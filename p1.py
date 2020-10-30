'''// Time Complexity :O(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : 
compared ith value with jth value in the beginning 
// Your code here along with comments explaining your approach
keep the jth index at one and ith index at one , compare i and i-1 element if its equal then increment the count else reset the count to 1. If count is less than 2 then replace jth idex element with ith
'''


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        

        j=1
        count=1
        
        for i in range(1,len(nums)):
            
            if (nums[i]==nums[i-1]):
                count+=1
            else:
                count=1
                
            if count<=2:
                nums[j]=nums[i]
                j+=1
                
                
        return j
