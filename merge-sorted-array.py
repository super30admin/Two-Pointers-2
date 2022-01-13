'''

TC: O(m+n)
SC: O(1)

Intuition: 

Start two pointers, one from last element of first array, another from last element of second array. Third pointer from last position of 1st array


'''
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        p1 = m + n - 1
        i, j = m - 1, n - 1
        
        while i > -1 and j > -1:
            if nums1[i] > nums2[j]:
                nums1[p1] = nums1[i]
                i -= 1
            else:
                nums1[p1] = nums2[j]
                j -= 1
            p1 -= 1
            
        while j > -1:
            nums1[p1] = nums2[j]
            j -= 1
            p1 -= 1
            
        return nums1
        