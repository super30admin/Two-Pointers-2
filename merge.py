#Tc:O(m*n)
#SC:O(1)-extra space 
# We begin from last element of ar2[] and search it in ar1[]. If there is a greater element in ar1[], then we move last element of ar1[] to ar2[]. To keep ar1[] and ar2[] sorted, we need to place last element of ar2[] at correct place in ar1[]. 
#Iterate through every element of nums2[] starting from last 
# element. Do following for every element num2[i]
# 
#  a) Loop from last element of nums1[] while element nums1[j] is 
#     smaller than nums2[i].
#        nums1[m+n-1] = nums1[j] // Move element one position ahead
#        m-- else n--
#  b) If any element is rremaining they are moved to nums1.


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
   
        while m > 0 and n > 0:
            if nums1[m - 1] > nums2[n - 1]:
                nums1[m + n - 1] = nums1[m - 1]
                m -= 1
            else:
                nums1[m + n - 1] = nums2[n - 1]
                n -= 1
        nums1[:n] = nums2[:n]
