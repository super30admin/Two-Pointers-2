#  https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/ 


# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1
        slow = 1
        fast = 1
        while fast < len(nums):
        #for fast in range(1,len(nums)):
            if(nums[fast] == nums[fast-1]):
                count+=1
            else:
                count = 1
            if((count <= 2)):
                nums[slow] = nums[fast]
                slow+=1
            fast+=1
        return slow 
