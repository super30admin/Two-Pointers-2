# TC : O(m+n)
# SC : O(1)
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        arrpointer1 = m-1
        arrpointer2 = n-1
        thirdpointer = m+n-1
        
        while(arrpointer2>=0 and arrpointer1>=0):        
            if nums2[arrpointer2]>nums1[arrpointer1]:
                nums1[thirdpointer] = nums2[arrpointer2]
                arrpointer2-=1
            else:
                nums1[thirdpointer] = nums1[arrpointer1]
                arrpointer1-=1
            thirdpointer-=1
        while(arrpointer2>=0):
                nums1[thirdpointer] = nums2[arrpointer2]
                arrpointer2-=1
                thirdpointer-=1
        return nums1