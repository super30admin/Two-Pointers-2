# // Time Complexity : O(m+n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
#Its a bit tricky and I did not understand it completely


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1=m-1
        p2=n-1
        ind=m+n-1
        
        while (p1>=0 and p2>=0):
            if nums1[p1]>=nums2[p2]:
                nums1[ind]=nums1[p1]
                p1-=1
            else:
                nums1[ind]=nums2[p2]
                p2-=1
            
            ind-=1
            
        while (p2>=0):
            nums1[ind]=nums2[p2]
            p2-=1
            ind-=1
        
        