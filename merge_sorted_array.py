class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        
        
        if nums1 is None or len(nums1)==0:
            return None
        n_end = n-1 #6
        m_end = m-1 #3
        m_last = m+n-1
        while n_end >=0 and m_end>=0:
            if nums2[n_end] >= nums1[m_end]:
                nums1[m_last] = nums2[n_end]
                n_end-=1 #5
                m_last-=1 
            else:
                nums1[m_last] = nums1[m_end]
                m_end-=1
                m_last-=1
        while n_end>=0:
            nums1[m_last] = nums2[n_end]
            n_end-=1
            m_last-=1
        return nums1
                