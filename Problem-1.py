#Time Complexity :o(n)
#Space Complexity :o(1)
#Did this code successfully run on Leetcode :yes
#Any problem you faced while coding this :no
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if(len(nums)==0 or nums==None):
            return 0
        
        counter=1
        j=1
        
        for i in range(1,len(nums)):
            if(nums[i]==nums[i-1]):
                counter+=1
            else:
                counter=1
            if(counter<=2):
                nums[j]=nums[i]
                j+=1
        return j
                