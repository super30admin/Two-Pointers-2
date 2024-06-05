# Time Complexity
# O(n)
# Space Complexity
# O(1)


# Approach :

# keep 3 pointers , one at m-1 th index, n-1th index and m+n-1 th index
# keep comparing the max of the both the largest elements in both the arrays
# let p1 point for the first array, p2 for the second, and p3 for the first array
# if an element from p1 is greater than p2, add the element in  the p3 th index, decrement p1 and p3
# else decrement p2 and p3
# in case the first array elements were greater than the second array elements, p2 would not be zero
# so then move the remaining p2 elements from the latest p3 index


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if not nums1:
            return None

        p1 = m-1
        p2 = n-1
        p3 = m+n-1

        while (p1 >= 0 and p2 >= 0):

            nums1[p3] = max(nums2[p2], nums1[p1])
            p3 = p3-1
            if nums1[p1] < nums2[p2]:
                p2 = p2-1
            else:
                p1 = p1-1

        while (p2 >= 0):
            nums1[p3] = nums2[p2]
            p2 = p2-1
            p3 = p3-1

        return nums1
