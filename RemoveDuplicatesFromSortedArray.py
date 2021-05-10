# TC: O(N) where N is the size of the input array. 
# SC: O(1) since we are adjusting the array in place. 

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1
        p1 = 1
        k = 2
        
        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                count += 1
            else:
                count = 1
            
            if count <= k:
                nums[p1] = nums[i]
                p1 += 1     
                
        return p1
