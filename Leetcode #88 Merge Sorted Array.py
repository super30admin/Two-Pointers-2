# Time Complexity: O(m + n)
# Space Complexity: O(1)

class Solution:
    def merge(nums1, m, nums2, n):
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if nums1 is None or len(nums1) == 0 or nums2 is None or len(nums2) == 0:
            return 
        
        p1 = m - 1
        p2 = n - 1
        p3 = m + n - 1

        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[p3] = nums1[p1]
                p1 -= 1
            else:
                nums1[p3] = nums2[p2]
                p2 -= 1
            
            p3 -= 1


        while p2 >= 0:
            nums1[p3] = nums2[p2]
            p2 -= 1
            p3 -= 1


        