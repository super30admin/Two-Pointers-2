class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        '''Time Complexity: O(n+m)
        Space Complexity: O(1)'''
        
        #If there are no elements is nums1, transfer nums2 to nums1
        if m==0:
            nums1[:]=nums2[:]
            
        #last pointer to nums1 and nums2
        p1=m-1
        p2=n-1
        
        #pointer to last 0 in nums1
        last=m+n-1
        
        #while p1 and p2 are in bound
        while p1>=0 and p2>=0:
            
            if nums1[p1]>nums2[p2]:
                nums1[last]=nums1[p1]
                p1-=1
                last-=1
                
            else:
                nums1[last]=nums2[p2]
                p2-=1
                last-=1
        #if p1 goes out of bound last remaining elements in nums2 to nums1 
        while p2>=0:
            nums1[last]=nums2[p2]
            p2-=1
            last-=1
