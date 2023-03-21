#tc = o(n)
#sc = o(1)
#ran on leetcode:yes


class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        i, count = 1, 1
        
        # Start from the second element of the array and process
        # elements one by one.
        while i < len(nums):
            
            # If the current element is a duplicate, 
            # increment the count.
            if nums[i] == nums[i - 1]:
                count += 1
                
                
                if count > 2:
                    nums.pop(i)
                    i-= 1
                
            else:
                count = 1
           
            # Move on to the next element in the array
            i += 1    
                
        return len(nums)