class Solution:#time O(n) space O(1)
    def removeDuplicates(self, nums: List[int]) -> int:
        c=1
        s=1
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:
                c+=1
            else:
                c=1
            if c<=2:
                nums[s]=nums[i]
                s+=1
        return s
