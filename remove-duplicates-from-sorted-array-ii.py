# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 0 or nums == None:
            return 
        
        # To check the number of duplicates at each and every step
        count = 0
        # Slow pointer which collects the required numbers
        j = 0
        
        # i is the fast pointer
        for i in range(len(nums)):
            
            #check if the number is equal to its previous number in nums and increment count if they are equal
            if nums[i] == nums[i-1]:
                count += 1
            
            #if they are not equal, its a new number so change count to 1
            else:
                count = 1
            
            #if count is less than some k (here 2), update the value at j to be that of value at i and increment j
            if count <= 2:
                nums[j] = nums[i]
                j += 1
                
        return j
                
                