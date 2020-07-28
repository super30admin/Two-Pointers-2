## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
#Time Complexity : O(n),
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n=len(nums)-1
        dup=0
        i=0
        j=1
        cur=1
        while j<=n:
            if nums[i]==nums[j]:
                if dup==0:
                    dup=1;
                    nums[cur] = nums[j]
                    cur+=1
                    j+=1
                else:
                    j+=1
            else:
                i = j;
                nums[cur] = nums[j]
                dup = 0;
                cur+=1
                j+=1
        return cur;
