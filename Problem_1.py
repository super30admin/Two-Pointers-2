# Runs on Leetcode
# Time complexity :  O(n)
# Memory complexity : O(1)


'''
1) Initialized pointer first which travels in range [1,len(nums)-1). 1 is inclusive boundary and len(nums)-1 is exclusive.

2) If the numbers at first-1 and first+1 indexes are equal, number at first pointer is deleted.

3) If not equal we increment first pointer

'''

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) < 3:
            return len(nums)
        first  = 1
        while (first < len(nums)-1):
            if nums[first-1] == nums[first+1]:
                del nums[first]
            elif nums[first-1] != nums[first+1]:
                first +=1
