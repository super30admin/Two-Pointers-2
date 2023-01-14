# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :Yes       
# Any problem you faced while coding this :No


class Solution(object):
    def removeDuplicates(self,nums):
        count=1
        p=1
        for i in range(1,len(nums)):
            if(nums[i]==nums[i-1]):
                count+=1
            else:
                count=1
            if(count<3):
                nums[p]=nums[i]
                p+=1
        return(p)
            
        