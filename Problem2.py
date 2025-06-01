
# // Time Complexity :O(M+N)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Three line explanation of solution in plain english
# Maintain 3 pointers start filling zeros first and then fill remaning elements
# https://leetcode.com/problems/merge-sorted-array/description/
# // Your code here along with comments explaining your approach

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        #nums1 has more length
        p1,p2,p3=m-1,len(nums1)-1,n-1
        while(p1>=0 and p3>=0):
            

            #compare p1 ,p3 ..p2 is 0 pointer
            if nums1[p1]>nums2[p3]:
                nums1[p2]=nums1[p1]
                p1-=1
                p2-=1
            else:
                nums1[p2]=nums2[p3]
                p3-=1
                p2-=1
        while p3>=0:
            nums1[p2]=nums2[p3]
            p2-=1
            p3-=1




        
        
