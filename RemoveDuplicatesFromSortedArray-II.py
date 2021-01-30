# TC: O(n)
# SC: O(1)
# LeetCode: Y(https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
# Approach: Since the array is sorted, all the duplicates if they exist they will be next to each other
#           track three variables: 
#           j for assignment, i to iterate through the array, count to track frequency of nums[i]
#           Move i forward in each iteration, assign nums[i] to nums[j] and increment j as long as count <= 2


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        # j pointer for assignment, count to track frequency of nums[i]
        j, count = 1, 1
        
        # move from i = 1 to the end of array one step at a time
        for i in range(1, len(nums)):
            # increment count if current element equals previous element
            if nums[i] == nums[i - 1]:
                count += 1
                
            # reset count if current element does not equal previous element    
            else:
                count = 1
                
            # if count is up to 2
            if count <= 2:
                # do the assignment
                nums[j] = nums[i]
                
                # move j forward
                j += 1
                
        # return the index up to which values were assignedor modified
        return j
