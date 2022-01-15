# Time Complexity : O(n) - Traverse each element
# Space Complexity : O(1)

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        # Two pointer approach
        # One pointer : to find where the new element should be updated as per result
        # the second pointer : where the new element is present in the input
        
        
        i = 1;
        j = 1;
        count = 1;
        
        while (i < len(nums)):
            
            # same element so increase the count
            if nums[i] == nums[i-1] :
                count += 1
                
            # new element found, so reset the count to 1
            else :
                count = 1
                
            # Copy the new element into the jth index 
            if count <= 2 :
                nums[j] = nums[i]
                j += 1 # Next space where incoming unique element should come
            
            
            i += 1
        
        # the length of the modified array
        return j