class Solution:
     # Time Complexity : O(n) where n is number of elements in the List nums
    # Space Complexity: O(1)
    def removeDuplicates(self, nums: List[int]) -> int:
        # If the list is empty return 0
        if nums is None or len(nums)==0:
            return 0
        j=1 # to keep track of the next index where elements needs to be added
        count=1 # count of specific number
        for i in range(1,len(nums)): #traversal of list
            if nums[i] == nums[i-1]: 
                count+=1 # if elements are are same increment count
            else:
                count=1 # if new element encountered then reset count to 1
            
            if count<=2:  # if the count of specif number is less than 2 simply update j as the specific number is correctly placeed. As we update j this means that it is set to the next index where new number needs to be placed 
               nums[j] = nums[i]
               j+=1          
        return j # returning j means index until which you need to consider the elements 






        
