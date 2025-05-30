"""
I implemented the solution using the two-pointer approach, where I insert elements from the second list into the first list in reverse order. I compare the last element of the first list with the last element of the second list and update the three pointers accordingly. At the end, if there are any remaining elements in the second list, I add them to the first list.
Time Complexity: O(m+n)
Space Complexity: O(1)
"""
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        point1 = m - 1
        point2 = n - 1
        insertion_point = len(nums1) - 1

        while(point2 >= 0 and point1 >= 0):

            if nums1[point1] < nums2[point2]:
                nums1[insertion_point] = nums2[point2]
                point2 -= 1
            else:
                nums1[insertion_point] = nums1[point1]
                point1 -= 1

            insertion_point -= 1
            
        while point2 >= 0:
            nums1[insertion_point] = nums2[point2]
            point2 -= 1
            insertion_point -= 1
