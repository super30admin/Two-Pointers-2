  ---------------------- Remove Duplicates------------------------------------------------   
# Time Complexity : O(N**2) N is the length of the nums.
# Space Complexity : O(1) as I am returning the same array used for exploring numbers
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here I used 2 pointer approach, to remove duplicates, first I initializes i and j pointers to 0 and move my j pointer when i encounter the same number as in the position of i.
# Once I reached the different number, If my j-i grater than 2, then I replace the array from i+2 th index to end with array of jth index, so that the duplicates will be removed.

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        i = 0
        j = 0
        while i<=j and j<len(nums):
            if nums[i] == nums[j]:
                j +=1
            else:
                if j-i>2:
                    i += 2
                    nums[i:] = nums[j:]
                    j = i
                else:
                    i = j
        if j == len(nums):
            if j-i>2:
                i += 2
                nums[i:] = nums[j:]
                j = i