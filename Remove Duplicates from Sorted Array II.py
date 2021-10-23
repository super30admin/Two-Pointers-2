# Did this code successfully run on Leetcode: Yes
# Time Complexity: O(n)
# Space Complexity:
# Logic: use i to traverse through the list from 2nd element & j to point at a location where removal is required. if
# i-1 == i then increment count else its a new element & make count = 1. keep on replacing jth element for count <= 2

class Solution:
    def removeDuplicates(self, nums):
        count = 1
        j = 1
        for i in range(1, len(nums)):
            if nums[i-1] == nums[i]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[j] = nums[i]
                j += 1
        return j