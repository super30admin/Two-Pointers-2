# TC : O(n)
# SC : O(1)
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        k=2
        f =1
        s=1
        count=1
        
        while(f<len(nums)):
            if(nums[f]==nums[f-1]):
                count+=1
            else:
                count=1                
            if count<=k:
                nums[s]=nums[f]
                s+=1
            f+=1
        return s

        