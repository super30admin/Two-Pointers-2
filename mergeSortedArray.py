


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        ptr1 = m-1
        ptr2 = n-1
        idx  =  m+n-1
        while(ptr1>=0 and ptr2>=0):
            if nums1[ptr1] > nums2[ptr2]:
                nums1[idx] =  nums1[ptr1]
                ptr1 -=1
            else:
                nums1[idx] =  nums2[ptr2]
                ptr2 -=1
            idx-=1
        while ptr2>=0:
            nums1[idx] =  nums2[ptr2]
            ptr2 -=1
            idx -=1
        return nums1

        
        
                
            
            
'''
        l = m + n
        m = m - 1
        n = n - 1
        for i in range(l-1,-1,-1):
          
            if n < 0 or m < 0:
                break
            
            if(nums1[m] >= nums2[n]):
                nums1[i] = nums1[m]
                m -= 1
            else:
                nums1[i] = nums2[n]
                n -=1
        nums1[:n + 1] = nums2[:n + 1]  


'''            
