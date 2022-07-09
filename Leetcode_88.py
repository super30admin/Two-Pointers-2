#Time Complexity: O(m+n)
#Space Complexity: O(1)

class Solution:
    def merge(self, nums1, m, nums2, n: int) -> None:
        i,j,k=m-1,n-1,m+n-1
        while i>=0 and j>=0:
            if nums1[i]>=nums2[j]:
                nums1[k]=nums1[i]
                i-=1
            else:
                nums1[k]=nums2[j]
                j-=1
            k-=1
        if i<0:
            nums1[:k+1]=nums2[:j+1]