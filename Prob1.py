#Time complexity: O(m*n)   
#Space complexity: O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        k = 2
        i= 1
        count = 1
        # two pointers, one moves forward with every element
        for j in xrange(1,len(nums)):
            if nums[j] == nums[j-1]:
                count +=1
            #reset the count when a new element is found
            else:
                count = 1
            #the i pointer moves only when count is less than or equal to k
            if count<=k:
                nums[i] = nums[j]
                i += 1
        return i
        
        
        
        