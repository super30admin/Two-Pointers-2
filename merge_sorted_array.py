class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        if not nums1:
            return
        #while both pointers are active
        while m and n:
            #last position in nums1 which will be eventually be sum of both array lengths
            pos=m+n-1
            #last value of whichever array is larger
            #just place that value to last position and reduce length of that array
            if nums1[m-1]>nums2[n-1]:
                nums1[pos]=nums1[m-1]
                m-=1
            else:
                nums1[pos]=nums2[n-1]
                n-=1
        #if length of nums2 is still active, only copy that values to empty places at nums1
        #case
        #nums1[456]
        #nums2[123]
        #nums1[456456]
        #still nums2 length=3, so iterate till that length and update start 3 values of nums1
        if n:
            nums1[:n]=nums2[:n]
            
            
#O(m+n)>>> traverse both arrays to place all values
#O(1) in place
            
       