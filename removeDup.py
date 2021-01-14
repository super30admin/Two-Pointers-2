# Time Complexity : O(n) n : length of the array
# Space Complexity: O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach: Two pointer method
#           start the loop from second number to compare as the array is sorted.
#           j : will be pointer indicating the final sorted array length
#           count : for keeping count of the same elements
#           if nums[i] == nums[i - 1] then increament count else initialise as 1 (indicates new element)
#           count <=2 so keep the element : copy that number and increment the j pointer
#           return j 

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        if len(nums)<=2:
            return len(nums)
        
        count = 1
        j = 1
        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                count += 1
            else:
                count = 1

            if count <= 2:
                nums[j] = nums[i]
                j += 1

        return j 
                