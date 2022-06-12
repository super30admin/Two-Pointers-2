#TC: O(n)
#SC: O(1)
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        s=f=1
        k=2
        c=1
        for f in range(1,len(nums)):
            if nums[f]==nums[f-1]:
                c+=1
            else:
                c=1
            if c<=k:
                nums[s]=nums[f]
                s+=1
        return s


