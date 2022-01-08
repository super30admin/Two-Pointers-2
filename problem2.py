class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        ptr1, ptr2= m-1,n-1
        #iterate from last position of nums1
        for ind in range(len(nums1)-1,-1,-1):
            if ptr2<0:
                break
            if ptr1 >= 0 and nums1[ptr1] > nums2[ptr2]:
                nums1[ind] = nums1[ptr1]
                ptr1 -= 1
                
            else:
                nums1[ind] = nums2[ptr2]
                ptr2 -= 1

#Time complexity O(len(nums1)+ len(nums2))
#space complexity O(1) inplace, use ptr variables