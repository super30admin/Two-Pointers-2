# Time O(m+n) 
# Space O(1)
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        k = n + m - 1
        i = m-1
        j = n-1
        while k >= 0:
            if i < 0:
                nums1[k] = nums2[j]
                k-=1
                j-=1
            elif j < 0:
                nums1[k] = nums1[i]
                k-=1
                i-=1
            else:
                if nums2[j]>=nums1[i]:
                    nums1[k] = nums2[j]
                    k-=1
                    j-=1
                else:
                    nums1[k] = nums1[i]
                    i-=1
                    k-=1

