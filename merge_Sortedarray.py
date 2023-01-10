# Time Complexity : O(N)
# Space Complexity : O{1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

 # start merging from the ends of the lists
 # destination d index to insert into nums1
 # if second list is empty, nothing more to merge
 # only merge from nums1 if there are items left to merge
 # insert at d the larger of the two values from nums1 and nums2
 
def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
       
      
        p1, p2 = m-1, n-1
     
        for d in range(m+n-1, -1, -1):
           
            if p2 < 0:
                return
           
            if p1 >= 0 and nums1[p1] > nums2[p2]:                
                nums1[d] = nums1[p1]
                p1 -= 1
            else:
                nums1[d] = nums2[p2]
                p2 -= 1