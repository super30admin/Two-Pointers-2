#time complexity O(n) and space complexity O(1)
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        i=m-1
        j=n-1
        k=m+n-1
# Traversing through both the arrays from the end and comparing elements and adding the greater elements at the end of first array
        while i>=0 and j>=0:
            if nums1[i]>nums2[j]:
                nums1[k]=nums1[i]
                i-=1
            else:
                nums1[k] = nums2[j]
                j-=1
            k-=1
            
        while j>=0:
            nums1[k]=nums2[j]
            j-=1
            k-=1
            
        return nums1
