#Time Complexity - O(m + n)
#space Complexity - O(1)
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        m -= 1
        n -= 1
        end = len(nums1) - 1
        while m >= 0 and n >= 0:
            if nums1[m] > nums2[n]:
                nums1[end] = nums1[m]
                m -= 1
            else:
                nums1[end] = nums2[n]
                n -= 1
            end -= 1
        
        while m >= 0:
            nums1[end] = nums1[m]
            end -= 1
            m -= 1
        
        while n >= 0:
            nums1[end] = nums2[n]
            end -= 1
            n -= 1        