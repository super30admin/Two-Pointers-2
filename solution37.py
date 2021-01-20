#Time Complexity:O(n)
#Space Complexity:O(1)
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1=m-1                           #initializing a pointer at mth position of nums1
        p2=n-1                           #initialzing a pointer at the last positon of nums2
        i=m+n-1                         #initializing a pointer at the last position of nums1
        while(p1>=0 and p2>=0):         #while p1 and p2 pointers are within their respective arrays
            if nums1[p1]>nums2[p2]:     # Amongst p1 and p2 , the highest pointer element will be placed at ith index of nums1
                nums1[i]=nums1[p1]
                i-=1
                p1-=1
            else:
                nums1[i]=nums2[p2]
                i-=1
                p2-=1
        while(p2>=0):                   #The remaining elements in nums2 after p1 exceed limit will be places in the nums1 array in order
            nums1[i]=nums2[p2]
            p2-=1
            i-=1