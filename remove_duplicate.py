# https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

# Time Complexity- O(n) Space Complexity- O(1)
class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        k = 2
        old = 0
        new = 0
        count = 0
        while new < len(nums):
            # check whether the previous number is same as the current
            if new != 0 and nums[new] == nums[new - 1]:
                # increase the count
                count += 1
            else:
                # if the first occurance
                count = 1
            # check the count is in given limit 
            if count <= k:
                # update the list with old 
                nums[old] = nums[new]
                # increment the old 
                old += 1
            # increment the new
            new += 1
        # return the old 
        return old

        
solution = Solution()
print(solution.removeDuplicates([1,1,1,2,2,3]))
# nums = [1,1,1,2,2,3]
# output = 5