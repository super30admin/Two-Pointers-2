## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

# // Time Complexity : o(n)
# // Space Complexity : o(1)

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 0
        maxi = 2
        for num in nums:
            if i < maxi or nums[i-maxi]!=num:
                nums[i]=num
                i+=1
        return i
    
    
                