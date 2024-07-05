class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.

        
        """
        
        #start searching for greater stuff from the end of the arrays, so 
        #the maximum will always be at end of the first one
        #three ptrs - p1: end of first array aka m p2: n 
        #runningpts follows placement of elements

        p1= m-1
        p2=n-1
        rp= m+n-1

        while p1>=0 and p2>=0:
            if nums1[p1]>=nums2[p2]:
                nums1[rp]=nums1[p1]
                p1-=1
            else:
                nums1[rp]=nums2[p2]
                p2-=1
            rp-=1
        while p2>=0:
            nums1[rp]=nums2[p2]
            rp-=1
            p2-=1