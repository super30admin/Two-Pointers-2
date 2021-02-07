# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        l=1
        count = 1
        for x in range(1,len(nums)):
            if nums[x]==nums[x-1]:
                count+=1

            else:
                count=1
                
            if count <3:
                    nums[l]=nums[x]
                    l+=1
            

        return l