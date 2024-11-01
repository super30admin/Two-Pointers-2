# time complexity: O(n)
# space complexity: O(1)
# Approach: I have used three pointers x, y and z. x is at the end of the first array, y is at the end of the second array and z is at the end of the merged array. I will compare the elements at x and y. If the element at x is greater than the element at y, I will replace the element at z with the element at x. I will decrement x by 1. If the element at x is less than or equal to the element at y, I will replace the element at z with the element at y. I will decrement y by 1. I will decrement z by 1. I will repeat this process until y is greater than or equal to 0.

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        x = m-1
        y = n-1
        z = m+n-1

        while(y>=0):
            if x>=0 and nums1[x]>nums2[y]:
                nums1[x], nums1[z] = nums1[z], nums1[x]
                x-=1
            else:
                nums1[z] = nums2[y]
                y -= 1
            z-=1