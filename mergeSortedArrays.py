#Leetcode Problem: 88

#solution 1:
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        j=0
        for i in range(m,m+n):
            nums1[i]=nums2[j]
            j+=1
        
        return(nums1.sort())

#TC: O((m+n) log (m+n))
#SC: O(1)

#Solution 2
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        i=m-1
        j=n-1
        k=m+n-1
        while i>=0 and j>=0:
            if nums1[i]>nums2[j]:
                nums1[k]=nums1[i]
                k-=1
                i-=1
            else:
                nums1[k]=nums2[j]
                k-=1
                j-=1
        while j>=0:
            nums1[k]=nums2[j]
            k-=1
            j-=1

#TC: O(m+n)
#SC: O(1)