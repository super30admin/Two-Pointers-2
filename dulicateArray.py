
// Time Complexity : o(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: I am searching every element and checking
    if its not equal then I am increasing the length by 1 and pushing it in place.

// Your code here along with comments explaining your approach



class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        length = 0
        
        for index, value in enumerate(nums):
            if(length <=1 ) or (nums[length - 2] != value):
                nums[length] = value
                length += 1
        return length
        
        