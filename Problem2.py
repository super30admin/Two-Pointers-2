# In the same array replace the exiting element with max in both arrays. Start from the end
#Intuition is to start at the end to make use of the zeros
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        x=m-1
        y=n-1
        i=m+n-1
        while(x>=0 and y>=0):
            if nums1[x]>nums2[y]:
                nums1[i]=nums1[x]
                i=i-1
                x=x-1
            else:
                nums1[i]=nums2[y]
                i=i-1
                y=y-1

        while(y>=0):
            nums1[i]=nums2[y]
            y=y-1
            i=i-1
        