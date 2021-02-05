# Time Complexity :O(n+m)
# Space Complexity :O(1)
#  Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no
#Leetcode : 88

# Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
#
# The number of elements initialized in nums1 and nums2 are m and n respectively.
# You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.

# Example 1:
#
# Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
# Output: [1,2,2,3,5,6]
# Example 2:
#
# Input: nums1 = [1], m = 1, nums2 = [], n = 0
# Output: [1]

def main():
    nums1 = [1, 2, 3, 0, 0, 0]
    m = 3
    nums2 = [2, 5, 6]
    n = 3
    ans = merge(nums1,m,nums2,n)
    print(ans)
def merge(nums1, m, nums2, n):
    """
    :type nums1: List[int]
    :type m: int
    :type nums2: List[int]
    :type n: int
    :rtype: None Do not return anything, modify nums1 in-place instead.
    """

    # Checking if the array is empty.
    if not nums1:
        return

    # Here the i is the last index where the value is there in array 1
    i = m - 1
    # J is the last index in array 2
    j = n - 1

    # Index is the index where the last zero is there.
    index = m + n - 1

    # Atleast exhausting one of the arrays. But we need to exhaust J
    while (i >= 0 and j >= 0):

        # If the last element in array 1 is greater than last element in array 2 then we need to assign the last element of array 1 to 0 else assign last element of array 2 with 0.
        # We keep decrementing whichever we have chosen.
        if nums1[i] > nums2[j]:
            nums1[index] = nums1[i]
            i -= 1
        else:
            nums1[index] = nums2[j]
            j -= 1

        index -= 1

    # Finally once the assignment is done, we can assign rest of the j's which ever position we have.
    while (j >= 0):
        nums1[index] = nums2[j]
        j -= 1
        index -= 1

    return nums1

if __name__ == '__main__':
    main()