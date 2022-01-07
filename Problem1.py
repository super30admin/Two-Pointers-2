# Time Complexity : O(m) where m is the length of the list.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes.
# Any problem you faced while coding this : Class Solution.
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 1
        j = 1
        count = 1
        while j < len(nums):
            if nums[j] == nums[j-1]:
                count +=1 
            else:
                count = 1
            if count <= 2:
                nums[i] = nums[j]
                i += 1
            j += 1
        return i
