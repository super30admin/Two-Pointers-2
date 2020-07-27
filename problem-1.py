'''
Approach:
1. we iterte over the array and maintian a flag to indicate wheather to inlude the current element or not.
2. if the flag is set to 1 we dont include and move on to the next element

'''

# Time Complexity : O(n) 
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        prev=0
        slow=1
        fast=1
        flag=0
        while(fast<len(nums)):
            if(nums[fast]==nums[prev]):
                if(flag==0):
                    nums[slow]=nums[fast]
                    slow+=1
                    fast+=1
                    flag=1
                else:
                    fast+=1
            else:
                prev=fast
                nums[slow]=nums[fast]
                slow+=1
                fast+=1
                flag=0
        return slow;