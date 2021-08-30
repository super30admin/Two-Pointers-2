#time comp- O(n)
#space- O(1)
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        n1=m-1
        n2=n-1
        t=m+n-1
        while n1>=0 and n2>=0:
            if nums1[n1]>nums2[n2]:
                nums1[t]=nums1[n1]
                n1=n1-1
            else:
                nums1[t]=nums2[n2]
                n2=n2-1
            t=t-1
        print(n1,n2)
        if n2 >= 0:
            nums1[:n2+1] = nums2[:n2+1]
        
        
