
#Time Complexity: O(n).
#Auxiliary Space: O(1)
#Did this code successfully run on leetcode :Yes

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        j = 1
        c =1
        
        for index in range(1,len(nums)):
            if nums[index]==nums[index-1]:
                c+=1
            else:
                c=1
                
            if c<=2:
                nums[j]=nums[index]
                j+=1
        return j