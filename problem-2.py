#Time Complexity :O(max(m,n))
#Space Complexity :O(1)
#Did this code successfully run on Leetcode : yes
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        r = m+n-1
        ptr1 = m-1
        ptr2 = n-1
        while(ptr1>=0 and ptr2>=0):
#Place the larger of 2 arrays in currect position
            if nums1[ptr1]>nums2[ptr2]:
                nums1[r] = nums1[ptr1]
                ptr1 -= 1
            else:
                nums1[r] = nums2[ptr2]
                ptr2 -= 1
            r -= 1
#If only elemnts of 2nd array is remaining, add them to array  1
        while(ptr2>=0):
            nums1[r]=nums2[ptr2]
            ptr2 -= 1
            r -= 1