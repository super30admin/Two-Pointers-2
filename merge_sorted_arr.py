#time complexity:o(m+n) where m is ele of 1st and n of 2nd arr
#space complexity:o(1)
#passed all cases on LeetCode:yes
#difficulty faced:-
# comments: in the code
#https://leetcode.com/problems/merge-sorted-array/submissions/
class Solution:
    def merge(self, nums1: 'List[int]', m: int, nums2: 'List[int]', n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        #maintain 3 ptrs. p3 is where we insert the bigger element
        #p1 and p2 go th nums in the arrays
        p1,p2,p3 = m-1,n-1,m+n-1
        
        
        while (p1 >= 0 and p2 >=0):
            
            if nums1[p1] > nums2[p2]:
                nums1[p3] = nums1[p1]
                p1 -=1
            else:
                nums1[p3] = nums2[p2]
                p2 -=1
            p3 -=1
        
        #theres a possibility that there are still elements left in 2nd arr so we need to insert them
        while (p2 >= 0):
            nums1[p3] = nums2[p2]
            p2 -=1
            p3 -=1
                