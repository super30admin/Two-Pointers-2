# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
# Use two pointer approach, 
# one pointer iterates over the array and the other pointer is used to write non duplicate elements
# when the count is less than or equal to k (2 in this case), overwrite the element with the next non duplicate element
# // Your code here along with comments explaining your approach
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i = 1 
        count = 1
        
        for j in range(1,len(nums)):
            if (nums[j] == nums[j-1]): # keep track of the count of duplicates
                count += 1
            else: # unique element, reset count
                count = 1
            if count <= 2: # duplicate smust not exceed 2, overwrite next non duplicate element
                nums[i] = nums[j]
                i += 1
            
        return i # i points to the end of the subarray that has atmost 2 duplicates
            