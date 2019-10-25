#leetcode submission:successful
#time complexity:O(n) 
#space complexity:O(1)
# we are keeping two pointer to check if more than two same elements are there in array and if there is then exchange the 3 element with the other elements 
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        l=2
        for r in range(2,len(nums)):
            if nums[l-2]!=nums[r]:
                nums[l]=nums[r]
                l=l+1
            
        return l
                