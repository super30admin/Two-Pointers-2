#Merge sorted array - 88
#time complexity =O(M+N)
#space complexity =O(1)
#Approach = Two pointer approach, we need to have 1 pointer at m location  and 2nd pointer at n location, if value at pointer1 is greater than value at pointer at then we insert at count. At the same time we reduce both count and pointer. Here count is the m+n-1

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        count=m+n-1
        p1=m-1
        p2=n-1
        
        while (p1>=0 and p2>=0):
            if nums1[p1]>nums2[p2]:
                nums1[count]=nums1[p1]

                count=count-1
                p1=p1-1
                
            else:
                nums1[count]=nums2[p2]
                
                
                count=count-1
                p2=p2-1

        while (p2>=0): # if still there are values in nums2
            nums1[count]=nums2[p2]
            
            count=count-1
            p2=p2-1