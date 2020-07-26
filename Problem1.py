# Time complexity: O(n)
# Space complexity: O(1)
# Works on leetcode: yes
# Approach: The idea here is go through the numbers and include those in the result that 
# haven't been included twice already.
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        length = 0
        for n in nums:
            if length<2 or n> nums[length-2]:
                nums[length] = n
                length +=1
        return length
        