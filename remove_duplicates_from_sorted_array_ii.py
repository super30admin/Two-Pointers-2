# Time Complexity: O(n) where n is the length of the array 
# Space Complexity:  O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 1 # to iterate over the array
        j = 1 # to maintain index of result array.
        count = 1
        while(i < len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[j] = nums[i]
                j+= 1
            i += 1
        return j
