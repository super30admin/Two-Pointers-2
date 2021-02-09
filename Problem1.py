"""
Time Complexity - O(n)
Space Complexity - O(1)
Using two pointers will traverse entire list and perform in place modification
j will indicate the elements of result list
initially count = 1
traversing through list
    if nums[i] == nums[i-1]
        increment count
    else
        count = 1
    if count <= 2
        nums[j] = nums[i]
        j += 1
        """
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 
        
        j = 1
        count = 1
        
        for i in range(1,len(nums)):
            if (nums[i] == nums[i-1]):
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[j] = nums[i]
                j += 1  
                
        return j