# in this I am keeping the pointer to the last element of the both the list

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        #i for first array
        #j for second array
        i=m-1
        j=n-1
        # last is pointing to the last element of the first array
        # which we are updating and insert the largest element at the end
        last=len(nums1)-1
        while i>=0 and j>=0:      
            if nums1[i]>nums2[j]:
                nums1[last]=nums1[i]
                i-=1
            else:
                nums1[last]=nums2[j]
                j-=1
            last-=1
        while j>=0:
            nums1[last]=nums2[j]
            j-=1
            last-=1
        return nums1