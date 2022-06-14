#// Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        l,r = 1, len(nums)-1
        curr = 1
        count = 1
        k = 2
        while(curr<=r):
            if nums[curr-1] == nums[curr]:
                count+=1
            else:
                count = 1
            if count <= k :
                nums[l] = nums[curr]
                l+=1
            curr+=1
        return l