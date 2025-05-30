
# // Time Complexity : o(n)
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english
# idea is to keep 2 pointers 1 to write and other to read and also maintain a counter to check if the count exceeds the k
# // Your code here along with comments explaining your approach

from typing import List
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        l,r,count,k =1,1,1,2
        while r<len(nums):
            if nums[r] == nums[r-1]:
                count+=1
            else:
                count=1
            if count<=k:
                nums[l] = nums[r]
                l+=1
            r+=1
        return l


        