#Time Complexity O(M+N) One pass for traversing both list array using Three pointers
#Space Complexity O(1)
#It successfully runs on the leetcode


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        if not nums1: return 
        i , j, k = m-1, n-1, (m+n)-1
        
        while i>=0 and j>=0:
            if nums1[i]>= nums2[j]:
                nums1[k]=nums1[i]
                i-=1
            else:
                nums1[k]= nums2[j]
                j-=1
            k-=1
     
            
        if j>=0:
            nums1[:j+1]= nums2[:j+1]

        return nums1