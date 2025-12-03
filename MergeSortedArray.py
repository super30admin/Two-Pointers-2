'''
In this problem I took 3 pointers, 2 pointers in first array, p1 at m-1 position first array and p3 at the end of first array which is of length m+n-1.
And p2 pointer at the end of second array. I took the pointers at the end of both arrays in order to make sure the resulting array is sorted at any point of time.
As long as both the pointers are in bounds I moved p1 anad p2 by placing the largest elements at the respective indices at the end of nums1 array.
If at any point p1 is out of bounds and p2 is still inbounds, all the remaining elements from nums2 are placed at the begining of nums1.
'''
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m-1
        p2 = n-1
        p3 = m+n -1
        # while bothe the pointers are inbounds
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[p3] = nums1[p1]
                p1 -= 1
            else:
                nums1[p3] = nums2[p2]
                p2 -= 1
            # decresing p3 pointer in both the cases
            p3 -= 1
        # one of the pointer is out of bounds
        # while p2 is still inbound
        while p2 >= 0:
            # copying all the nums2 elements to nums1
            nums1[p3] = nums2[p2]
            p2 -= 1
            p3 -= 1
'''
Time Complexity: O(m+n)
Since we have to iterate through 2 arrays each of length m and n
Space Complexity: O(1)
we are placing the elements in the same array, we are not using any extra space.
'''