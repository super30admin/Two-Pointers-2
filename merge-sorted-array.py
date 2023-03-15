
# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english
#take two pointers and place the highest among them at the end of nums1 array
# Your code here along with comments explaining your approach

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """        
        p = m + n -1
        l = m - 1
        r= n - 1
        while  l >= 0 and r>=0:
            print(l,r)
            if nums2[r] >= nums1[l]:
                nums1[p] = nums2[r]
                p-=1
                r-=1
            else:
                nums1[p] = nums1[l]
                p-=1
                l-=1
        while l >= 0:
           nums1[p]=nums1[l]
           l-=1
           p-=1
        while r >= 0:
           nums1[p]=nums2[r]
           r-=1
           p-=1
    
        
            
