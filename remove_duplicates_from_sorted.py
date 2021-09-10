# // Time Complexity : O(n) where n is the number of elements
# // Space Complexity : O(1) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : none

# // Your code here along with comments explaining your approach
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) < 2: return len(nums)
        i = j = 0
        # i:slow ptr
        # j: fast ptr
        count = 0
        while j < len(nums):
            if j > 0 and nums[j-1] == nums[j]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[i] = nums[j]
                i += 1
            j += 1
          
        return i
            