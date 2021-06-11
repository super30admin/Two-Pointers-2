from typing import List


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        ptr1=m-1
        ptr2=n-1
        i=(m+n)-1 #end of the combined array
        #while i>=0:
        while(ptr1>=0 and ptr2>=0):
            if (nums1[ptr1]>nums2[ptr2]):
                nums1[i]=nums1[ptr1]
                ptr1-=1
            else:
                nums1[i]=nums2[ptr2]
                ptr2-=1
            i-=1

        while(ptr2>=0):
            nums1[i]=nums2[ptr2]
            ptr2-=1
            i-=1


s=Solution()
print(s.merge([1,2,3,0,0,0],3,[2,5,6],3))