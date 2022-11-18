'''
Time Complexity --> 
O(m+n)

Space Complexity -->
O(1)
'''

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if m==0:
            nums1[:]=nums2.copy()
        elif n==0:
            return
        else:
            i = m-1
            j = n-1
            k = (m+n)-1
            while i>=0 and j>=0:
                if nums1[i]>=nums2[j]:
                    nums1[k] = nums1[i]
                    i-=1
                else:
                    nums1[k] = nums2[j]
                    j-=1
                k-=1
                #print(nums2[j])
            if j>=0:
                while k>=0:
                    nums1[k]=nums2[j]
                    j-=1
                    k-=1
        print(nums1)
            
            
            
        