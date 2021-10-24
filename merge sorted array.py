# TC-O(n+m)
# SC-O(1)
def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
    """
    Do not return anything, modify nums1 in-place instead.
    """
    # brute force
    # if n!=0:
    #     j=0
    #     for i in range(m,len(nums1)):
    #         nums1[i]=nums2[j]
    #         j=j+1
    #         print(nums1)
    # nums1=nums1.sort()
    # return nums1
    if ( n= =0):
        return i=m-1
    j=n-1
    k=m+n - 1
    while(i>= 0 and j>=0):
        if nums1[i]>nums 2 [j]:
            nums1[k]=nums 1 [i]

            i-=1
        else:
            nums1[k]=nums 2 [j]

            j-=1
        k-=1
    while j>=0:
        nums1[k]=nums 2 [j]
        j-=1
        k-=1
