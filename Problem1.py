# Time Complexity :O(n)
# Space Complexity :O(1)
#  Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no
#Leetcode : 80

# Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice
# and return the new length.
#
# Do not allocate extra space for another array; you must do this by modifying the input array
# in-place with O(1) extra memory.
#
# Clarification:
#
# Confused why the returned value is an integer, but your answer is an array?
#
# Note that the input array is passed in by reference, which means a modification to the input array
# will be known to the caller.

# Internally you can think of this:
#
# // nums is passed in by reference. (i.e., without making a copy)
# int len = removeDuplicates(nums);
#
# // any modification to nums in your function would be known by the caller.
# // using the length returned by your function, it prints the first len elements.
# for (int i = 0; i < len; i++) {
#     print(nums[i]);
# }

# Example 1:
#
# Input: nums = [1,1,1,2,2,3]
# Output: 5, nums = [1,1,2,2,3]
# Explanation: Your function should return length = 5, with the first five elements of nums being
#  1, 1, 2, 2 and 3 respectively. It doesn't matter what you leave beyond the returned length.
# Example 2:
#
# Input: nums = [0,0,1,1,1,1,2,3,3]
# Output: 7, nums = [0,0,1,1,2,3,3]
# Explanation: Your function should return length = 7, with the first seven elements of nums
#  being modified to 0, 0, 1, 1, 2, 3 and 3 respectively. It doesn't matter what values are set beyond the returned length.

def main():
    nums = [0,0,1,1,1,1,2,3,3]
    ans = removeDuplicates(nums)
    print(ans)


def removeDuplicates(nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    # Here checking if the numbers is empty.
    if not nums:
        return 0

    # Starting from second index and looking backwards. Count is the count of the element.
    j, count = 1, 1
    for i in range(1, len(nums)):
        # If the previous number is same as current one, then increase the count. Else reset the count because there is a new number.
        if nums[i - 1] == nums[i]:
            count += 1
        else:
            count = 1

        # Great intuation where we only need the length hence we just modified part where increment the j pointer only if there is a new element or it is in range of 2.
        if count <= 2:
            nums[j] = nums[i]
            j += 1

    # Return j because that will be the new length. The values from j + 1 till i - 1 will have all duplicates which have more than 1 duplicates.
    return j


if __name__ == '__main__':
    main()