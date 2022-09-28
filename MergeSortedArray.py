class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # Brute Force way should be union and then sort the array
        # Time Complexity: O(m+n log(m+n)) where m and n is the length of nums1 - nums2 and nums2 respectively
        # Space Complexity:O(1)
        
        # This is a three pointer approach
        # Here we keep the pointers as shown
        
        p1 = m - 1
        p2 = n - 1
        p3 = m + n - 1
        
        while (p1 >= 0 and p2 >= 0):
            
            if nums1[p1] > nums2[p2]:
                nums1[p3] = nums1[p1]
                p3 -= 1
                p1 -= 1
            else:
                nums1[p3] = nums2[p2]
                p2 -= 1
                p3 -=1
                
        while (p2 >= 0):
            nums1[p3] = nums2[p2]
            p3 -= 1
            p2 -=1
            
        # Time COmplexity: O(m + n) where where m  and n are given in the question
        # Space Complexity: O(1)