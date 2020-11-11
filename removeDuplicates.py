# // Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english
"""
Maintain a pointer j which starts from the beginning and another i which goes through the array.
Keep count of the duplicates next to each other, if count <= 2, then replace j pointer which i
so this replaces the first (0..2) elements of the array with a number pointed to by i 
"""
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        j = 1
        count = 1
        
        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
                
            if count <= 2:
                nums[j] = nums[i]
                j += 1
                
        return j