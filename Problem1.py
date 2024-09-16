from typing import List

"""

        Student :  Shahreen Shahjahan Psyche
        Time Complexity : O(N)
        Space Complexity : O(1)

"""

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        # edge case
        if not nums:
            return 0
        
        i = 1
        j = 1
        
        count = 1
        
        while(i<len(nums)):
            
            # if my previous number is equal to my current number then I am increasing the count. If not then reseting the
            # count to 1
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            
            # if count is less than 2, that means we want to keep the element. So, we put the element of ith position in jth position.
            # after that increasing the j
            if count <= 2:
                nums[j] = nums[i]
                j += 1
            i += 1
            
        return j
                