#Time complexity: O(n)
#Space complexity: O(1)
#Worked on leetcode: yes
# This algorithm uses 3 pointer approach. First pointer starts from the last index of the small array, and
# second pointer starts from last element of 2nd array (before 0's). Then, a main pointer starts from the last element of the
# 2nd array. The values at first pointer and second pointer are compared iteratively, and the larger element is kept at the
# poisition of main pointer. It continues, till either first or second pointer goes out of bound of lengths of both arrays.
# Further, all elements of the remaining array are copied while decrementing the main pointer, in the bigger array.

def merge(nums1, m, nums2, n) -> None:
    """
    Do not return anything, modify nums1 in-place instead.
    """
    first_ptr = m - 1
    second_ptr = n - 1

    ptr = m + n - 1
    while (first_ptr >= 0 and second_ptr >= 0):
        if nums1[first_ptr] >= nums2[second_ptr]:
            nums1[ptr] = nums1[first_ptr]
            first_ptr -= 1
            ptr -= 1
        else:
            nums1[ptr] = nums2[second_ptr]
            second_ptr -= 1
            ptr -= 1

    while (second_ptr >= 0):
        nums1[ptr] = nums2[second_ptr]
        second_ptr -= 1
        ptr -= 1

    return nums1

print(merge([0], 0, [1], 1))