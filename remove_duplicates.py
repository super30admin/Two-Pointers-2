// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        f=0
        s=0
        count=0
        for f in range(0,len(nums)):
            if (f>0 and nums[f]==nums[f-1]):
                count+=1
            else:
                count=1
            if count<=2:
                nums[s]=nums[f]
                s+=1
        return s
