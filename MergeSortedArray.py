# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        ptr1 = m-1
        idx = m+n-1
        ptr2 =n-1
        while ptr1>=0 and ptr2>=0:
            if nums1[ptr1]<nums2[ptr2]:
                nums1[idx]=nums2[ptr2]
                ptr2-=1
                idx-=1
            else:
                nums1[idx]=nums1[ptr1]
                ptr1-=1
                idx-=1
        #Check if there are still elements present in 2nd array if so put them into first array
        while ptr2>=0:
            nums1[idx]=nums2[ptr2]
            ptr2-=1
            idx-=1
        return nums1

