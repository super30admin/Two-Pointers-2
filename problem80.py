class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0
        if len(nums)==1:
            return 1
        i=1
        j=1
        cnt = 1
        while i<=j and j<len(nums):
            if nums[j]!=nums[j-1]:
                nums[i]=nums[j]
                cnt=1
            else:
                cnt+=1
            if cnt<=2:
                nums[i] = nums[j]
                i+=1
            j+=1
        return i