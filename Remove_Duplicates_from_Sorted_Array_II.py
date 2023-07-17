class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums)==0:
            return 0
        k=0
        for i in nums:
            if k<2 or i!= nums[k-2]:
                nums[k]= i
                k+=1
        return k