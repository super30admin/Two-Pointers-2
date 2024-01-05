'''

Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No issues faced

Your code here along with comments explaining your approach:
Use a variable 'count' to kep track of occurence of a certain element in the array. Skip the element if it occurs more than twice

'''

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1
        i = 1
        j = 1

        while i < len(nums):
            if nums[i] == nums[i-1]:
                count += 1
                if count > 2 :
                    i += 1
                    continue

            elif nums[i] != nums[i-1]:
                count = 1

            nums[j] = nums[i]
            j += 1
            i += 1

        return j