"""

Time Complexity : inside function
Space Complexity :inside function
Did this code successfully run on Leetcode : Yes

Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

"""

# Approach - 1

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        """
        Removing the unwanted elements from the nums
        Time Complexity : O(N^2) => O(N) + O(N^2) (deletion)
        Space Complexity : O(1)
        """
        if len(nums) == 0:
            return 0
        k = 2
        count = 1
        i = 1
        
        while i < len(nums):
            if nums[i] == nums[i - 1]:
                count += 1
                # checking if the num exceeded the allowed frequency
                if count > k:
                    del nums[i]
                    i = i - 1
            
            # if the element is not same then reset the count to 1  
            else:
                count = 1
            i += 1
            
        return len(nums)

# Approach - 2

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        """
        Overwriting unwanted duplicates: in this we will maintain two pointers s and i where s will keep track of 
        allowed elements and i will replace the unwanted elements
        Time Complexity : O(N)
        Space Complexity :O(1)
        """
        if len(nums) == 0:
            return 0
        k = 2
        s  = 1
        count = 1
        
        for i in range(1,len(nums)):
            if nums[i] == nums[i - 1]:
                count += 1
                
            else:
                count = 1
                
            if count <= k:
                nums[s] = nums[i]
                s += 1
                
        return s
                
            
        
        
        
        