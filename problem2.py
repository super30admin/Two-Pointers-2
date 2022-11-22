#time complexity: O(n)
#space complexity: O(1)
#ran on leetcode: yes
#i points to the nth element in nums1. j ponints to the last/nth element in nums2. k points
#to the last element of nums1. Place nums1[i] or nums2[j] whichever is larger in nums1[k] and decrement
#i or j accordingly.decrement k as well. Finally put the remining elements in either i or j in nums1[k]
class Solution:
    def merge(self, nums1, m: int, nums2, n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i=m-1
        j=len(nums2)-1
        k=len(nums1)-1
        while(i>=0 and j>=0):
            if(nums1[i]>nums2[j]):
                nums1[k]=nums1[i]
                k-=1
                i-=1
            else:
                nums1[k]=nums2[j]
                k-=1
                j-=1
        while(i>=0):
            nums1[k]=nums1[i]
            k-=1
            i-=1
        while(j>=0):
            nums1[k]=nums2[j]
            k-=1
            j-=1
s=Solution()
nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [2,5,6]
n = 3
s.merge(nums1,n,nums2,m)
print(nums1)