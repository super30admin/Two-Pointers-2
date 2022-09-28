"""
https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

Approach --
1. Use two pointers i, j. Maintain a counter.
2. While traversing through the array, if
a. current element is equal to previous element, increment counter
b.

TC = O(n)
SC = O(1)
"""
num = [1, 1, 1, 2, 2, 3]


def prac(nums):
    if nums is None or len(nums) == 0:
        return 0

    j = 1
    count = 1

    for i in range(1, len(nums)):
        # print(nums[i-1])
        if nums[i] == nums[i - 1]:
            count += 1
        else:
            count = 1
        if count <= 2:
            nums[j] = nums[i]
            j += 1
    return j


print(prac(num))
