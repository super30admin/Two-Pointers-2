"""
Rasika Sasturkar
Time Complexity: O(m+n), i.e. traversing through all the elements.
Space Complexity: O(1)
"""


def merge(nums1, m, nums2, n) -> None:
    """
    Do not return anything, modify nums1 in-place instead.
    We used 2 pointers for comparing the values between nums1 &
    nums2. And there is also third pointer to keep track of the
    position to be updated.
    """
    p1 = m - 1
    p2 = n - 1
    idx = m + n - 1

    while p1 >= 0 and p2 >= 0:
        if nums1[p1] >= nums2[p2]:
            nums1[idx] = nums1[p1]
            p1 -= 1
        else:
            nums1[idx] = nums2[p2]
            p2 -= 1
        idx -= 1

    while p2 >= 0:
        nums1[idx] = nums2[p2]
        p2 -= 1
        idx -= 1

    return nums1


def main():
    """
    Main function - examples from LeetCode problem to show the working.
    This code ran successfully on LeetCode and passed all test cases.
    """
    print(merge(nums1=[1, 2, 3, 0, 0, 0], m=3, nums2=[2, 5, 6], n=3))  # return [1, 2, 2, 3, 5, 6]
    print(merge(nums1=[1], m=1, nums2=[], n=0))  # return [1]
    print(merge(nums1=[0], m=0, nums2=[1], n=1))  # return [1]


if __name__ == "__main__":
    main()
