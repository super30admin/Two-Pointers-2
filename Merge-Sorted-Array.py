# Time Complexity : O(N)
# Space Complexity: O(1)

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        # Set arr1 and arr2 to end indeces of the respective arrays
        arr1 = m - 1
        arr2 = n - 1
    
        # And move p backwards through the array, each time writing
        # the smallest value pointed at by p1 or p2.
        for i in range(n + m - 1, -1, -1):
            if arr2 < 0:
                break
            if arr1 >= 0 and nums1[arr1] > nums2[arr2]:
                nums1[i] = nums1[arr1]
                arr1 -= 1
            else:
                nums1[i] = nums2[arr2]
                arr2 -= 1
                