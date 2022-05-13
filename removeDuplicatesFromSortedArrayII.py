class Solution:
        
    def removeDuplicates(self, nums: List[int]) -> int:
        
        # Threshold Condition atmost twice
        k = 2
        
        # Create 2 ptrs
        slowPtr = 1
        fastPtr = 1
        
        # Intialize count
        count = 1
        
        # Iterate the list
        while fastPtr < len(nums):
            
            # Check if nums[fast-1] == nums[fast]
            if nums[fastPtr-1] == nums[fastPtr]:
                # Update the count 
                count+=1
            
            else:
                # This is the new number. Reset count
                count = 1
                
            # Check the 'k' condition
            if count <= k:
                # Override the slowPtr value
                nums[slowPtr] = nums[fastPtr]
                slowPtr+=1
                
            fastPtr+=1 # For condition breach also
            continue
        
        return slowPtr