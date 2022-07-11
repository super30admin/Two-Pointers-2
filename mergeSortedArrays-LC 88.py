# Time Complexity = O(m + n)
# Space Complexity = O(1)

class Solution:
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if len(nums1) == 0 or nums1 == None:
            return
        
        # Initialising the 3 pointers
        p1 = m - 1              # Nums 1
        p2 = n - 1              # Nums 2
        p3 = m + n - 1          # Result in Nums 1
        
        
        while (p1 >= 0 and p2 >= 0):
            if nums1[p1] < nums2[p2]:
                nums1[p3] = nums2[p2]
                p2 -= 1
                p3 -= 1
                
            else:
                nums1[p3] = nums1[p1]
                p3 -= 1
                p1 -= 1
        
        # Checking the boundary counditions, i.e. if nums2 is not completely transferred
        while (p2 >= 0):
            nums1[p3] = nums2[p2]
            p3 -= 1
            p2 -= 1
                
        