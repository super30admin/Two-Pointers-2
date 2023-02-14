# Author: Naveen US
# Titile: Remove duplicates.

# Time complexity: O(n)
# Space complexity: O(1)
# Did the code run on leetcode: Yes

def removeDuplicates(self, nums):
    i = 0
    for n in nums:
        if i < 2 or n > nums[i-2]:
            nums[i] = n
            i += 1
    return i
