# // Time Complexity : O(M+N)
 # // Space Complexity : O(1)
 # // Did this code successfully run on Leetcode : Yes

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i=1
        j=1
        ctr =1
        while(j<len(nums)):
            if(nums[j]==nums[j-1]):
                ctr+=1
                # i+=1
            else:
                ctr=1
            if(ctr<=2):
                nums[i]=nums[j]
                i+=1
            j+=1
        return i
                
                
        