# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : YES
# // Any problem you faced while coding this : No 
# // Your code here along with comments explaining your approach
# remove duplicates from array
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i, j, counter = 1, 1, 1
        while (j < len(nums)):
            if (nums[j] == nums[j-1]):
                counter += 1
            else:
                counter = 1
            if counter <=2:
                nums[i] = nums[j]
                i += 1
            j += 1
        return i
            
        