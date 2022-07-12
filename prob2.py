class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        p1 = m - 1 
        p2 = n - 1
        p3 = m + n -1
        
        while (p1 >=0 and p2 >= 0):
            if(nums1[p1] > nums2[p2]):
                nums1[p3] = nums1[p1]
                p1 -=1
            
            else:
                nums1[p3] = nums2[p2]
                p2 -=1
                      
            p3 -=1
        
        while (p2 >= 0):
            nums1[p3]=nums2[p2]
            p2 -= 1
            p3 -= 1
            

#TC ==> 0(m+m)
#SC ==> 0(1)