class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        #Time Complexity: O(m + n)
        #Space Complexity: O(1)
        
        pointer1, pointer2 = m - 1, n - 1
        idx = m + n - 1
        
        while pointer1 >= 0 and pointer2 >= 0:
            if nums1[pointer1] >= nums2[pointer2]:
                nums1[idx] = nums1[pointer1]
                pointer1 -= 1
            else:
                nums1[idx] = nums2[pointer2]
                pointer2 -= 1
            idx -= 1
                
        while pointer2 >= 0:
            nums1[idx] = nums2[pointer2]
            pointer2 -= 1
            idx -= 1
        
        return