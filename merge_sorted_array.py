# Time Complexity : O(m+n) : Need to traverse all the elements in both arrays
# Space Complexity : O(1)

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        # Start from right most element in each arrays and merge element into first array
        i = m - 1
        j = n - 1
        k = m + n - 1
        
        # Iterate till one of the arrays is traversed completely
        while i>= 0 and j >= 0 :
            if nums1[i] > nums2[j] :
                nums1[k] = nums1[i]
                i = i - 1
            else :
                nums1[k] = nums2[j]
                j = j - 1
            
            k = k - 1
            
        
        # left out in second array
        while j >= 0 :
            nums1[k] = nums2[j]
            k = k - 1
            j = j - 1
            
        
        return nums1