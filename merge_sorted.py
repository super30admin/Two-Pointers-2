class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
#         TC===> O(n+m)
#  sc===>O(1)
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i=m-1
        j=n-1
        k=m+n-1
        
#         if any one of the array pointer exhausts
        while(i>=0 and j >=0):
            if nums1[i]>nums2[j]:
                nums1[k]=nums1[i]
                i=i-1
            else:
                nums1[k]=nums2[j]
                j=j-1
            k=k-1
#            j pointer array has other value left within it then, we need to add it 
# we don't need to add i pointer arry as we are adding to that array only
        while(j>=0):
            nums1[k]=nums2[j]
            j=j-1
            k=k-1