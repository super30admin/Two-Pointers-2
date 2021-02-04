'''
Time complexity: O(m + n)
Space complexity: O(1)
'''
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if nums1 is None or nums2 is None:
            return
        
        i = m - 1
        j = n - 1
        
        index = m + n - 1
        while i >= 0 and j >= 0:
            if nums1[i] > nums2[j]:
                nums1[index] = nums1[i]
                i = i - 1
            else:
                nums1[index] = nums2[j]
                j = j - 1
            index = index - 1
        
        # Check for when nums2 has elements left when i < 0
        while j >=0 :
            nums1[index] = nums2[j]
            j = j - 1
            index = index - 1