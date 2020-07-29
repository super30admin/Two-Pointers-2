# Time Complexity : O(m + n) where n is len of the list, in which we store all numbers
# Space Complexity : O(1) we are not creating any space
# Did this code successfully run on LeetCode : yes
# Any problem you faced while coding this : No


# we create two pointers one is initialized at the end of the list, for the merging list, it will be before zeros
# we will create third pointer index pointer at the end of the merging array
# we will loop both list (first two pointers l1 and l2), from their ends and find the maximum number
# if l1 is maximum, we will decrement the l1 pointer and index pointer
# if l2 is maximum, we will decrement the l2 pointer and index pointer
# when it goes out of the list in the merging list, we will copy rest of the elements to merging list


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        pt1 = m - 1
        pt2 = n - 1

        index = m + n - 1

        while (pt1 >= 0 and pt2 >= 0):

            if nums1[pt1] > nums2[pt2]:

                nums1[index] = nums1[pt1]

                pt1 -= 1

            elif nums1[pt1] < nums2[pt2]:

                nums1[index] = nums2[pt2]

                pt2 -= 1


            else:

                nums1[index] = nums1[pt1]
                index -= 1
                nums1[index] = nums2[pt2]

                pt1 -= 1
                pt2 -= 1

            index -= 1

        while (pt2 >= 0):
            nums1[index] = nums2[pt2]
            pt2 -= 1
            index -= 1

        return nums1







