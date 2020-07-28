# Time Complexity : O(n), where n is the length of nums
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

 # Your code here along with comments explaining your approach
class Solution(object):
    # This problem can be solved using two pointers, where one moves in a linear fashion
    # for each element and the other only moves when the count of a unique element is <= 2,
    # also setting the element at pointer i to j. The count is reset to one for the next
    # unique element, this way the whole array will only have 2 or less unique elements, return j.
    def removeDuplicates(self, nums):
        if not nums:
            return 0

        count, j = 1, 1

        for i in range(1, len(nums)):
            # if duplicates increment count otherwise start over
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            # swapping until 2 or less similar elements found
            # condition can be modified for any number of duplicates
            if count <= 2:
                nums[j] = nums[i]
                j += 1
        # print nums
        return j


Solution().removeDuplicates([1,2,2,2,2,2,2,3,3,3])
