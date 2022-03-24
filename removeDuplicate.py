# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english

# // Your code here along with comments explaining your approach


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)
        low = 0
        mid = low + 2
        high = len(nums)-1
        while(mid <= high):
            if(nums[low] == nums[mid]):
                nums.pop(mid)
                high = high - 1
            else:
                low = low + 1
                mid = low + 2
        