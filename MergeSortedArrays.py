
# // Time Complexity : o(n)
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english
# idea is to maintian 3 pointers to iterate and fill the arrays simultaneously other solutions will overrite the results


# // Your code here along with comments explaining your approach

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        p1,p2,p3 = m-1, n-1, len(nums1)-1
        while p1>=0 and p2>=0:
            if nums1[p1] > nums2[p2]:
                nums1[p3]=nums1[p1]
                p1-=1
            else:
                nums1[p3] = nums2[p2]
                p2-=1
            p3-=1
        while p2>=0:
            nums1[p3] = nums2[p2]
            p2-=1
            p3-=1  
        