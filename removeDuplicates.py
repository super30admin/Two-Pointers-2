#80. Remove Duplicates from Sorted Array II
#Time Complexity : O(n). 
# Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
#intialised i and j to index 1. then checked if prev element and current are equal if yes incremeant count by 1 else make count as 1 . Then if the count is less than 2 will move the i th element to j position and increament j. Will continue the loop until i goes out of bound and return the result
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 0 or not nums:
            return 0
        j = 1
        count = 1
        for i in range(1,len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[j] = nums[i]
                j += 1
        return j