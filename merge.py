class Solution:
    def merge(self, nums1, m, nums2, n) :
        '''
        T = O(N)
        S = O(1)
        '''
        if not nums1: return 0 
        ptr1 = m-1
        ptr2 = n-1
        i = m + n - 1 
        while ptr1 >= 0 and ptr2 >= 0 :
            if nums1[ptr1] > nums2[ptr2]:
                nums1[i] = nums1[ptr1]
                ptr1 -= 1 
            else:
                nums1[i] = nums2[ptr2]
                ptr2 -= 1 
            i -= 1 
        while (ptr2 >= 0 ):
            nums1[i] = nums2[ptr2]
            ptr2 -= 1 
            i -= 1 
		  
    def subOptimalmerge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        Algo : Merging and then sorting 
        T = O(N+M)log(N+M)
        S = O(N)
        """
        if m == 0 :
            idx = 0
        else:
            idx = m
        for i in nums2:
            nums1[idx] = i
            idx += 1
        return nums1.sort()
    
    
    
