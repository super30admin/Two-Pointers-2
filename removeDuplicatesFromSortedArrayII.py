# Time Complexity : O(n)
# Space Complexity : O(1)

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n=len(nums)
        l=r=0
        c=1
        while r<n:
            if r!=0 and nums[r]!=nums[r-1] :
                c=1
            
            if r!=0 and nums[r]==nums[r-1]:
                c+=1

            if c<=2:
                nums[l]=nums[r]
                l+=1

            r+=1
        
        return l