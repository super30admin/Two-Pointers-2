# Time Complexity : O(n), n is no of elements in the array
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA 

# Your code here along with comments explaining your approach:
# using two pointer approach, because of given constraint that we cannot use any extra space
# max frequency allowed is 2
# we have to replace the ans array - sorted with duplicates removed (only until 2 allowed) in the first j slots of the given array
# so using j to track to the position where we have to replace the elements
# starting with index 1, so that we can look at previous element
# if the current element is same as previous one, then count increases
# else, if new element, count changes to 1
# if count is <= 2, we replace the element at jth index with this element
# if more than 2, we just move i to traverse the list

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 0:
            return -1

        n = len(nums)
        j = 1
        count = 1
        # traversing the list
        for i in range(1, n):
            # if same as previous element
            if nums[i] == nums[i - 1]:
                # increase count
                count += 1
            else:
                # different element -> reset count to 1
                count = 1
            
            # if count is <= 2, then we put this element at jth index
            if count <= 2:
                nums[j] = nums[i]
                j += 1

            # if count is more, then we just increment i -> happening with i loop
        
        # first j slots have the answer
        return j



        