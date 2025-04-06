"""
Initially I am having issues in solving the approach I used when the second array is still not empty.

After that I understand from the video, you have to take care of the second array when it is empty.
"""

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """


        total_length = m+n-1

        first_length = m-1

        second_length = n-1

        while(first_length>=0 and second_length>=0):

            if(nums2[second_length]>nums1[first_length]):
                nums1[total_length] = nums2[second_length]
                second_length-=1
            else:
                nums1[total_length] = nums1[first_length]
                first_length-=1

            total_length-=1


        while(second_length>=0):
            nums1[total_length] = nums2[second_length]
            total_length-=1
            second_length-=1













