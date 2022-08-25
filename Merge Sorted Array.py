class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        
        i = m-1
        j = n-1
        k = m + n -1
        
        if(m==0):
            for l in range(n):
                nums1[l] = nums2[l]
        while(i > -1 or j > -1):
            if(i == -1):
                nums1[k] = nums2[j]
                j-=1
            elif(j == -1):
                nums1[k] = nums1[i]
                i-=1
            elif(nums1[i] < nums2[j]):
                nums1[k] = nums2[j]
                j-=1
            else:
                nums1[k] = nums1[i]
                i-=1
            k-=1