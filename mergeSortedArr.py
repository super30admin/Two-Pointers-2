
#Time Complexity :  O(n)
#Space Complexity :  O(1)
#Did this code successfully run on Leetcode : Yes

#code along with comments 
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m-1                                #p1 points at m-1 index
        p2 = n-1                                #p2 points at n-1 index
        idx = m+n-1                             #idx points at last index of nums1
        
        while p1>=0 and p2>=0:                  #if this conditions holds true
            if nums1[p1] >= nums2[p2]:          #elem at nums1[p1] >= nums2[p2]
                nums1[idx] = nums1[p1]          #we swap the elem at p1 to idx and decrement pointers
                p1 -= 1
            else:                               #otherwise
                nums1[idx] = nums2[p2]          #we swap elemt at p2 in nums2 with idx
                p2 -= 1                         #and we decrement pointers
            idx -= 1
        
        while p2>=0:                            #if there are elements still left in nums2
            nums1[idx] = nums2[p2]              #we swap elem at p2 with idx
            p2 -= 1                             #decrement pointers accordingly
            idx -= 1
        
        return nums1                            #return nums1 which is changed inplace