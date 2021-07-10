#https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
#time-o(n)
#space-o(1)
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
        if len(nums)<=2:
            return len(nums)
        count=1
        j=1
        i=1
        while i<len(nums):
        #for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:
                count+=1
            else:
                count=1
            if count<=2:
                if i!=j:
                    nums[j]=nums[i]
                j+=1
            i+=1
        return j 