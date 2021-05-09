# time : 0(m+n)
#space : 0(1)
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        k = m + n - 1
        i = m - 1
        j = n - 1       
        while k >=0:
            if i >= 0 and  (j < 0 or nums1[i] >= nums2[j] ) :
                nums1[k] = nums1[i]
                i = i -1
            else:
                nums1[k] = nums2[j]
                j = j -1
            k = k - 1 
        return nums1     
      
        