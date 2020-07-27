class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        #initializing pointers with last position of arrays
        pt1=m-1
        pt2=n-1
        index=m+n-1
        #condition to check bounds for both arrays
        while pt1>=0 and pt2>=0:
            #condition to check greater number
            if nums2[pt2]>nums1[pt1]:
                nums1[index]=nums2[pt2]
                pt2-=1
            else:
                nums1[index]=nums1[pt1]
                pt1-=1
            index-=1
            #condition where 2nd array is not traversed completely
        while pt2>=0:
            nums1[index]=nums2[pt2]
            index-=1
            pt2-=1
#Time-Complexity: O(n+m)
#space-complexity: O(m)