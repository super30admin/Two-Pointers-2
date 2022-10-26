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