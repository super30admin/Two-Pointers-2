// Time Complexity :o(n^2)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : yes
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        i=len(nums1)-1
        j= m-1
        k=len(nums2)-1
        while(i>=0):
            if(j<0):
                nums1[i]=nums2[k]
                k-=1
                i-=1
            elif (k<0):
                break
            elif(nums1[j]>nums2[k]):
                nums1[i]=nums1[j]
                i-=1
                j-=1
            else:
                nums1[i]=nums2[k]
                k-=1
                i-=1
