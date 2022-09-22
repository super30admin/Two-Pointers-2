# Time Complexity : O(n) we are traversing through the entire array
# Space Complexity : O(1)   - we didn't use any extra space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

class Solution:
    def removeDuplicates(self, nums) -> int:
        
        
        if len(nums) == 0: return 0 
        
        c = 1  #first poiner here is the counter which initially points to 1
        k = 1   #k is the required output initially points to 1
        
        for i in range(1,len(nums)):  #traverse through the entire array
            
            if nums[i] == nums[i-1]:  #check backwards of every element
                
                c+=1  #if they are same increase the counter
                
            else: 
                
                c = 1 #else, change the counter value to 1
                
                
            if c<=2:  #until the counter is less than or equal to 2, increase k and asssign the value of indexi i to index k
                
                nums[k] = nums[i] 
                
                k+=1 
                
                
        return k   #return k, as it gives the required array element count