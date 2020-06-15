// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
 
 use to pointers. one to loop through the entire array and count the repeating numbers and the other to keep track of the elements index where the
 // last repeated element was present.

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        j =1
        count = 1
        for i in range(1,len(nums)):
            
            if(nums[i]==nums[i-1]):
                count +=1
            else:
                count = 1
            if(count<=2):
                nums[j] = nums[i]
                j +=1
        return j    
