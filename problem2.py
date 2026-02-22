# Problem 2
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        end_ptr = m+n-1
        m = m-1
        n = n-1
        while(m>=0 and n>=0):
            if nums1[m] >= nums2[n]:
                nums1[end_ptr] = nums1[m]
                m -=1
            else:
                nums1[end_ptr] = nums2[n]
                n -= 1
            end_ptr-=1
        while(n >= 0):
            nums1[end_ptr]=nums2[n]
            n-=1
            end_ptr-=1
        return nums1