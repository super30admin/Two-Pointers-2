"""
Problem: 80. Remove Duplicates from Sorted Array II
Solution:
    - use two pointers p1 and p2
    - p1 finds all new values and p2 keeps track of the result condition
Time Complexity: O(n), n is length of array
Space Complexity: O(1), in place implementation
"""


class Solution:
    def removeDuplicates(self, nums):
        # p2 keeps track of the result condition
        p2 = 1
        # to keep track of condition of having max 2 occurences of single number
        count = 1

        # Move p1 pointer through the array
        for p1 in range(1, len(nums)):
            if nums[p1] == nums[p1 - 1]:
                count += 1
            else:
                count = 1

            # if result condition satisfies
            if count <= 2:
                nums[p2] = nums[p1]
                p2 += 1

        # since p2 tracks the result condition
        return nums[:p2]


obj = Solution()
print(obj.removeDuplicates([1,1,1,2,2,3]))