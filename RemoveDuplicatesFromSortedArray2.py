class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        
        # Brute force approach will be to store in a hashmap
        # Iterate over the entire array and make the value equal to 2 if it is greater than 2
        # Time Complexity: O(n)
        # Space Complexity: O(n)
        
        if len(nums) == 0:
            return 0
        
        count = 1
        j = 1
        
        for i in range(1,len(nums)):
            
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            
            if count <= 2:
                nums[j] = nums[i]
                j += 1
                
        return j
    
    # Time Complexity: O(n)
    # Space Complexity: O(1)