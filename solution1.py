# https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
# // Time Complexity : o(n)
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this : maintaining three pointers
#
#
# // Your code here along with comments explaining your approach

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 1
        fast = 1
        prev = 0
        flag = 0

        while fast < len(nums):
            if nums[prev] == nums[fast]:
                if flag == 0:
                    nums[slow] = nums[fast]
                    slow += 1
                    fast += 1
                    flag = 1

                else:
                    fast += 1
            else:
                nums[slow] = nums[fast]
                slow += 1
                prev = fast
                fast += 1
                flag = 0

        return slow