class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        if(len(nums1) == 0): return
        ptr1 = m - 1
        ptr2 = n - 1
        i = m + n - 1
        while(ptr1>= 0 and ptr2 >= 0):
            if(nums1[ptr1] >= nums2[ptr2]):
                nums1[i] = nums1[ptr1]
                ptr1 -= 1
            else:
                nums1[i] = nums2[ptr2]
                ptr2 -= 1
                
            i-= 1
        while(ptr2 >= 0):
            nums1[i] = nums2[ptr2]
            ptr2 -= 1
            i-=1

#T.C => O(m + m)
#S.C => O(1)
#Approach => we know that num1 is size of m + n  which can accomadate both the nums list. Now we have to loop till ptri and ptr2 is equal or greater than 0.
# if we see the nums1 of ptr1 is greater than nums2 of ptr2 then we append nums1 of ptr1 in nums1. both the nums comparision are started from last index.
# if nums2 ptr2 is greater than nums1 ptr1 then we append nums2 ptr2, at the end if there are some elements present in nums2 just we have to append all of them in the nums1.   