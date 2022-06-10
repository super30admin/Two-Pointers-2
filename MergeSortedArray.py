#time complexity : O(m+n) i.e two pointers are covering all the elments of nums1 array and nums2 array
#space complexity : O(1)
#Did this code successfully run on Leetcode : Yes
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        #defining the location of two pointers
        pointer1=m-1
        pointer2=n-1
        index = m+n-1
        while pointer1>=0 and pointer2>=0:
            #if the element in nums1 is greater than the nums 2 elemen than placing the greater num from the end in the array nums1
            if nums1[pointer1] > nums2[pointer2]:
                nums1[index]= nums1[pointer1]
                #decrementing the pointer1 in nums1 numbers
                pointer1 -=1
            else:
                nums1[index]= nums2[pointer2]
                #decrementing the pointer2 in nums2 numbers
                pointer2 -=1
            index -=1
            #for the edge case i.e, if all numbers in the first pointer is done then copying the remaining elements of nums2 in num1
        while pointer2 >= 0:
            nums1[index] = nums2[pointer2]
            pointer2 -=1
            index -=1
