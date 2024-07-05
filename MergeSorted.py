# Time Complexity : O(m + n)
# Space Complexity : O(1)

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i , j , r = m - 1 , n - 1 ,  m + n -1

        while j >= 0 and i >= 0 :
            if nums1[i] <= nums2[j]:
                nums1[r] = nums2[j]
                j -= 1

            else:
                nums1[r] = nums1[i]
                i -= 1
            
            r -= 1
        
        while j >= 0:
            nums1[r] = nums2[j]
            j, r = j - 1, r - 1


